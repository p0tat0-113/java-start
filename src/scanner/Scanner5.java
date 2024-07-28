package scanner;

import java.util.Scanner;

public class Scanner5 {
    public static void main(String[] args){
        //첫 번째 숫자와 두 번째 숫자를 더해서 출력하는 프로그램을 개발하자.
        //첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램을 종료한다.
        //프로그램은 반복해서 실행된다.

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("첫번째: ");
            int firstValue = scanner.nextInt();
            System.out.print("두번째: ");
            int secondValue = scanner.nextInt();

            if(firstValue == 0 && secondValue ==0){
                break;
            }
            System.out.println("합: "+(firstValue+secondValue));
        }
    }
}
