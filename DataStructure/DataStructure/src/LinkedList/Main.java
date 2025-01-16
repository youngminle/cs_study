package LinkedList;

import java.util.Scanner;


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