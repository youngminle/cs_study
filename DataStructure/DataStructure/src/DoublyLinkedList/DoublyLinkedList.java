package DoublyLinkedList;

class Node<T> {
    T data;
    Node<T> prev;
    Node<T> next;
    
    public Node(T data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList<T> {
    private Node<T> head;  // 리스트의 시작 노드
    private Node<T> tail;  // 리스트의 끝 노드
    private int size;      // 리스트의 크기

    //모든 데이터 출력
    public void printAll(){
        //노드 변수를 선언하고 해당 연결리스트의 첫 머리를 가르키도록
        Node<T> current = head;

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    //모든 데이터 제거
    public void clear(){
        head = null;
        size = 0;
    }

    //연결리스트에 삽입
    public void insertAt(int index, T data){
        //연결리스트의 크기보다 크거나 
        //음수의 위치에 삽입하려고 할때 
        if(index < 0){
            throw new IndexOutOfBoundsException("인덱스값은 음수가 될 수 없습니다");
        }

        if(index > size){
            throw new IndexOutOfBoundsException("인덱스값이 연결리스트에 크기에 벗어났습니다");
        }

        //삽입하려는 노드 생성
        Node<T> newNode = new Node<>(data);
        if(index == 0){
            //연결리스트에 가장 앞부분에 삽입하려고 할 때
            newNode.next = this.head;
            //이미 리스트에 삽입이 있었을때
            if(this.head != null){
                this.head.prev = newNode;
            }
            this.head = newNode;

        }else if(index == this.size){
            //연결리스트 가장 마지막 부분에 삽입하려고 할 때
            newNode.next = null;
            newNode.prev = this.tail;
            this.tail.next = newNode;
        }else{
            //중간에 삽입하려고 할때
            //삽입하려고 하는 노드 바로 전까지 가기 위한 변수
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            newNode.prev = current;
            current.next = newNode;
            newNode.next.prev = newNode;
        }

        if(newNode.next == null){
            this.tail = newNode;
        }

        //크기 증가
        this.size++;
    }

    //마지막 삽입
    public void insertLast(T data){
        insertAt(this.size, data);
    }

    //인덱스 삭제
    public T deleteAt(int index){
        //연결리스트의 크기보다 크거나 
        //음수의 위치에 삽입하려고 할때 
        if(index < 0){
            throw new IndexOutOfBoundsException("인덱스값은 음수가 될 수 없습니다");
        }

        if(index > size){
            throw new IndexOutOfBoundsException("인덱스값이 연결리스트에 크기에 벗어났습니다");
        }
        //연결리스트의 첫 머리 획득
        Node<T> current = head;
        T delData;

        if(index == 0){
            //첫 노드를 다음 노드를 가르키도록
            delData = head.data;            
            if(this.head.next == null){
                //다음 노드가 없을때
                this.head = null;
                this.tail = null;
            }else{
                this.head = this.head.next;
                this.head.prev = null;
            }


        }else if(index == this.size -1){
            delData = this.tail.data;
            this.tail.prev.next = null;
            this.tail = this.tail.prev;
        }else{
            for(int i = 0; i < index -1; i++){
                current = current.next;
            }
            delData = current.next.data;
            current.next = current.next.next;
            current.next.prev = current;
        }
        
        //연결리스트 크기 한개 감소
        size--;
        return delData;
    }

    //마지막 삭제
    public T deleteLast(){
        return deleteAt(size-1);
    }

    //해당 인덱스 읽기
    public T getNodeAt(int index){
        //연결리스트의 크기보다 크거나 
        //음수의 위치에 삽입하려고 할때 
        if(index < 0){
            throw new IndexOutOfBoundsException("인덱스값은 음수가 될 수 없습니다");
        }

        if(index > size){
            throw new IndexOutOfBoundsException("인덱스값이 연결리스트에 크기에 벗어났습니다");
        }

        //연결리스트의 첫 머리 획득
        Node<T> current = head;

        for(int i = 0; i < index -1; i++){
            current = current.next;
        }

        return current.data;
    }

    public T getTail(){
        return tail.data;
    }

    public int getSize(){
        return size;
    }
    

}
