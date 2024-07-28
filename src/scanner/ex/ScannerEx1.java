package scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args){
        //사용자로부터 입력받은 이름과 나이를 출력하세요. 출력 형태는 "당신의 이름은 [이름]이고, 나이는 [나이]살입니다." 이
        //어야 합니다.

        Scanner scanner = new Scanner(System.in);

        //nextInt()는 정수를 입력받지만 엔터키를 읽지는 않는다. 그래서 nextInt()가 실행된 후에는 입력버퍼에 개행 문자가 남아있다.
        //그러면 다음 nextLine()을 실행할 때 버퍼에 남아있는 개행문자가 읽혀버림.
        //그래서 nextLine()을 한 번 호출해서 개행문자를 소비하게 해야한다.
        int age = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.println("나이: "+age+ " 이름: "+name);
    }
}
