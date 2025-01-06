import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList<T> {
    private Node<T> head;  // 리스트의 시작 노드
    private int size;      // 리스트의 크기

    public LinkedList() {
        this.head = null;
        this.size = 0;
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

        Node<T> newNode = new Node<>(data);

        if(index == 0){
            //연결리스트에 가장 앞부분에 삽입하려고 할 때
            newNode.next = head;
            head = newNode;
        }else{
            //연결리스트 가장 마지막 부분에 삽입하려고 할 때
            //삽입하려고 하는 노드 바로 전까지 가기 위한 변수
            Node<T> current = head;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        //크기 증가
        size++;
    }

    //마지막 삽입
    public void insertLast(T data){
        insertAt(size, data);
    }

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

    //인덱스 삭제
    public void deleteAt(int index){
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

        if(index == 0){
            //첫번째 노드를 제거
            
            //첫 노드를 다음 노드를 가르키도록
            head = head.next;
            
        }else{
            //나머지 노드 제거
            for(int i = 0; i < index -1; i++){
                current = current.next;
            }
            current.next = current.next.next;
        }

        //연결리스트 크기 한개 감소
        size--;
    }

    //마지막 삭제
    public void deleteLast(){
        deleteAt(size-1);
    }


    //해당 인덱스 읽기
    public T getNodeAt(int index){
        //연결리스트의 첫 머리 획득
        Node<T> current = head;

        for(int i = 0; i < index -1; i++){
            current = current.next;
        }

        return current.data;
    }
}

public class Main {
    public static void main(String[] args){

        //연결리스트 객채 생성
        LinkedList<Integer> list = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        boolean condition = true;

        while (condition) {
            
            System.out.println("호출할 함수 번호를 입력해주세요");
            System.out.println("0 : 종료");
            System.out.println("1 : 전체 출력");
            System.out.println("2 : 인덱스에 삽입");
            System.out.println("3 : 마지막 삽입");
            System.out.println("4 : 연결리스트 비우기");
            System.out.println("5 : 연결리스트 인덱스로 삭제");
            System.out.println("6 : 연결리스트 마지막 삭제");
            System.out.println("7 : 연결리스트 인덱스 조회");
            
            scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            int index = 0;
            int data = 0;


            switch(number) {
                case 0:
                    System.out.println("함수 종료");
                    condition = false; 
                    break;
                case 1:
                    System.out.println("연결리스트 전체 출력");
                    list.printAll();
                    break;
                case 2:
                    System.out.println("인덱스에 삽입");

                    System.out.println("인덱스를 입력해주세요");
                    scanner = new Scanner(System.in);
                    index = scanner.nextInt();

                    System.out.println("저장할 값을 입력해수제요");
                    scanner = new Scanner(System.in);
                    data = scanner.nextInt();

                    list.insertAt(index, data);
                    break;
                case 3:
                    System.out.println("연결리스트 마지막에 삽입");
                    System.out.println("저장할 값을 입력해수제요");
                    scanner = new Scanner(System.in);
                    data = scanner.nextInt();
                    list.insertLast(data);
                    break;
                case 4:
                    list.clear();
                    System.out.println("연결리스트 비우기 완료");
                    break;
                case 5:
                    System.out.println("삭제할 인덱스 입력");
                    scanner = new Scanner(System.in);
                    index = scanner.nextInt();

                    list.deleteAt(index);
                    break;
                case 6:
                    list.deleteLast();
                    System.out.println("마지막 인덱스 삭제");
                    break;
                case 7:
                    System.out.println("조회할 인덱스 입력");
                    scanner = new Scanner(System.in);
                    index = scanner.nextInt();

                    data = list.getNodeAt(index);
                    System.out.println("결과값");
                    System.out.println(data);
                    break;
                default:
                    System.out.println("잘못된 입력값이 들어왔습니다.");
                    System.out.println("함수 종료");
                    condition = false; 
                    break;
            }

            System.out.println();
            System.out.println();
        }

    }
    
}
