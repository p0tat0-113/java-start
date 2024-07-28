package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args){
        //사용자로부터 n개의 정수를 입력받아 배열에 저장한 후, 배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로
        //그램을 작성하자. 실행 결과 예시를 참고하자.

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];


        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        if(arr.length > 0){
            int min = arr[0], max = arr[0];
            for(int i = 1; i < arr.length; i++){
                if (min > arr[i]){
                    min = arr[i];
                }
                if (max < arr[i]){
                    max = arr[i];
                }
            }
            System.out.println("max: "+max);
            System.out.println("min: "+min);
        }
    }
}
