package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args){
        //다음 실행 예시를 참고해서, 사용자로부터 계속 입력을 받아 입금과 출금을 반복 수행하는 프로그램을 작성하자.
        //또한 간단한 메뉴를 표시하여 어떤 동작을 수행해야 할지 선택할 수 있게 하자
        //출금시 잔액이 부족하다면 "x원을 출금하려 했으나 잔액이 부족합니다."라고 출력해야 한다.
        Scanner scanner = new Scanner(System.in);

        int balance = 0;

        while(true){
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택: ");
            int num = scanner.nextInt();

            if(num == 1){
                System.out.print("입금액을 입력하세요: ");
                int depositAmount = scanner.nextInt();
                balance = putMoney(balance,depositAmount);
            } else if (num == 2) {
                System.out.print("출금액을 입력하세요: ");
                int withdrawAmount = scanner.nextInt();
                balance = getMoney(balance,withdrawAmount);
            } else if (num == 3) {
                System.out.println("현재잔액: "+balance);
            } else if (num == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("다시 입력해주세요.");
            }

        }
    }

    public static int putMoney(int balance, int depositAmount){
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + (balance+depositAmount));
        return balance+depositAmount;
    }

    public static int getMoney(int balance, int withdrawAmount){
        if (balance >= withdrawAmount){
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + (balance-withdrawAmount));
            return balance-withdrawAmount;
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 하였으나 잔액이 부족합니다.");
            return balance;
        }
    }
}
