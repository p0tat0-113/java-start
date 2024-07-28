package scanner.ex;
import java.util.Scanner;
public class ScannerEx4 {
    public static void main(String[] args){
        //사용자로부터 하나의 정수를 입력받고, 이 정수가 홀수인지 짝수인지 판별하는 프로그램을 작성하세요.
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        for (int i = 1; i < 10; i++){
            System.out.println(num + " * "+i+" = "+num*i);
        }
    }
}
