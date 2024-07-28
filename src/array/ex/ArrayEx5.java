package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args){
        //이전 문제에서 입력받을 숫자의 개수를 입력받도록 개선하자.
        //실행 결과 예시를 참고하자

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];

        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        System.out.println(sum);
        System.out.println((double)sum/arr.length);

    }
}
