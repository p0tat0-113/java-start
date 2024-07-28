package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요: ");
        int firstNum = scanner.nextInt();
        System.out.print("두번째 숫자를 입력하세요: ");
        int secondNum = scanner.nextInt();

        System.out.println(firstNum+secondNum);
    }
}
