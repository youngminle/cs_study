package Queue;

import DoublyLinkedList.DoublyLinkedList;

public class Queue<T> {
    DoublyLinkedList<T> queue = null;

    public Queue(){
        queue = new DoublyLinkedList<>();
    }

    //삽입
    public void enqueue(T data){
        this.queue.insertAt(0, data);
    }

    //삭제
    public T dequeue(){
        try{
            return queue.deleteLast();
        }
        catch (Exception e){
            return null;
        }
    }

    //데이터 확인
    public T front(){
        return queue.getTail();
    }

    //비어있는지 확인
    public boolean isEmpty(){
        return (queue.getSize() == 0);
    }
}
