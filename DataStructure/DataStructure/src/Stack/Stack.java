package Stack;

import LinkedList.LinkedList;

public class Stack<T> extends LinkedList{
    LinkedList<T> list = null;
    
    public Stack(){
        list = new LinkedList<>();
    }

    //삽입
    public void push(T data){
        list.insertAt(0, data);
    }

    //삭제
    public T pop(){
        try{
            return list.deleteAt(0);
        }
        catch (Exception e){
            return null;
        }
    }

    //데이터 확인
    public T peek(){
        return list.getNodeAt(0);
    }

    //비어있는지 확인
    public boolean isEmpty(){
        
        return (list.getSize() == 0);
    }

    




}
