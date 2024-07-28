package scanner;

import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args){
        ///사용자가 입력한 문자열을 그대로 출력하는 예제를 만들어보자.
        //exit 라는 문자가 입력되면 프로그램을 종료한다.
        //프로그램은 반복해서 실행된다.

        Scanner scanner = new Scanner(System.in);

        while(true){
            String str = scanner.nextLine();
            if (str.equals("exit")){ //문자열이 같은지를 비교할 때는 .equals()를 쓴다.
                break;
            }
            System.out.println(str);
        }
    }
}
