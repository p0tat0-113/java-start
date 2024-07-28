package scanner;

import java.util.Scanner;//Scanner 클래스 임포트

public class Scanner1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//scanner객체 생성

        System.out.print("문자열을 입력하세요: "); //print는 자동으로 개행(\n)하지 않음.
        String str = scanner.nextLine(); //입력을 string으로 엔터(\n)를 입력할 때까지 가져옴
        System.out.println(str);

        System.out.print("정수를 입력하세요: ");
        int intValue = scanner.nextInt(); //입력을 int로 가져옴
        System.out.println(intValue);

        System.out.print("실수를 입력하세요: ");
        double doubleValue = scanner.nextDouble(); //입력을 double로 가져옴
        System.out.println(doubleValue);
    }
}
