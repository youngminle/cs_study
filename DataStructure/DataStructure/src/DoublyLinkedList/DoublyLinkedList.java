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
    private int size;      // 리스트의 크기


}
