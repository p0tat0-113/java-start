package scanner.ex;
import java.util.Scanner;
public class ScannerEx3 {
    public static void main(String[] args){
        //사용자로부터 하나의 정수를 입력받고, 이 정수가 홀수인지 짝수인지 판별하는 프로그램을 작성하세요.
        Scanner scanner = new Scanner(System.in);

        String foodName = scanner.nextLine();
        int price = scanner.nextInt();
        int quantity = scanner.nextInt();

        System.out.println(foodName +quantity+"개를 주문하셨습니다. 가격은 총 "+(price*quantity)+"원 입니다."  );
    }
}
