package Stack;

public class Main {
    public static void main(String[] args){

        //스택 생성
        Stack<Integer> stack = new Stack<>();
        System.out.println("------ 삽입 / 삭제 테스트 ------ ");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("------ 삽입 / 삭제 테스트2 ------ ");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        stack.pop();
        stack.pop();
        System.out.println(stack.isEmpty());
    }
}
