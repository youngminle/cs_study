package Queue;

public class Main {
    public static void main(String[] args){
        Queue<Integer> stack = new Queue<>();
        System.out.println("------ 삽입 / 삭제 테스트 ------ ");
        stack.enqueue(1);
        stack.enqueue(2);
        stack.enqueue(3);

        System.out.println(stack.dequeue());
        System.out.println(stack.dequeue());
        System.out.println(stack.dequeue());
        System.out.println(stack.dequeue());
        
        System.out.println(stack.isEmpty());
    }
}
