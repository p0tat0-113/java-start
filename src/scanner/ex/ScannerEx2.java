package scanner.ex;
import java.util.Scanner;
public class ScannerEx2 {
    public static void main(String[] args){
        //사용자로부터 하나의 정수를 입력받고, 이 정수가 홀수인지 짝수인지 판별하는 프로그램을 작성하세요.
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();;
        if(num%2 ==0){
            System.out.println("짝수입니다.");
        } else{
            System.out.println("홀수입니다.");
        }
    }
}
