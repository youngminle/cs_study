/*
 * 문제
 * 요세푸스 문제는 다음과 같다.
 * 1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다. 
 * 이제 순서대로 K번째 사람을 제거한다. 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다. 
 * 이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 
 * 원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다. 
 * 예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.
 * N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.
 * 
 * 입력
 * 첫째 줄에 N과 K가 빈 칸을 사이에 두고 순서대로 주어진다. (1 ≤ K ≤ N ≤ 5,000)
 * 
 * 출력
 * 예제와 같이 요세푸스 순열을 출력한다.
 * 
 * 예제 입력
 * 7 3
 * 예제 출력
 * <3, 6, 2, 7, 5, 1, 4>
 */
package Baekjoon;

import java.util.Scanner;

class Node<T>{
    T data;
    Node<T> next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList<T>{
    private Node<T> head;
    private int size;

    public LinkedList(){
        this.head = null;
        this.size = 0;
    }

    //연결리스트 마지막 삽입
    public void insertLast(T data){
        //삽입할 노드 생성
        Node<T> newNode = new Node<>(data);

        if(size == 0){
            //연결리스트 처음 삽입할때
            head = newNode;
        }else{
            //연결리스트 마지막 삽입
            //연결리스트 첫번때 요소 확인
            Node<T> current = head;

            for(int i = 0; i < size-1; i++){
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
        }

        size ++;

    }

    //연결리스트 전체 출력
    public void printAll(){
        
    }

    //연결리스트 인덱스 기준 삭제

}

public class problem_1158 {
    public static void main(String[] args){
        System.out.println("숫자를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        

        String arr[] = number.split(" ");

        if(arr.length != 2){
            throw new IndexOutOfBoundsException("두개의 숫자를 띄어쓰기로 구분해 입력해주세요");
        }

        int k = Integer.parseInt(arr[0]);
        int n = Integer.parseInt(arr[1]);
        
        if(k <= 0){
            throw new IndexOutOfBoundsException("입력값은 0보다 커야합니다");
        }

        if(k < n){
            throw new IndexOutOfBoundsException("첫번째 입력값이 두번째 입력값보다 커야합니다");
        }

        if(k >= 5000){
            throw new IndexOutOfBoundsException("입력값은 5000보다 작아야합니다");
        }

        for(int i = 0; i <= k; i++){
            System.out.println(i);
        }


        
    }
}
