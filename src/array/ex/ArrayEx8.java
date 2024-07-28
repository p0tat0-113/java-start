package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args){
        //이전 문제에서 학생수를 입력받도록 개선하자.
        //실행 결과 예시를 참고하자.

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[][] arr = new int[length][3];

        for(int i = 0; i<arr.length; i++){
            System.out.println(i+1 + "번 학생의 점수를 입력하세요.");
            System.out.print("국어 점수: ");
            arr[i][0] = scanner.nextInt();
            System.out.print("영어 점수: ");
            arr[i][1] = scanner.nextInt();
            System.out.print("수학 점수: ");
            arr[i][2] = scanner.nextInt();
        }

        for(int i = 0; i<arr.length; i++){
            int sum = 0;
            for(int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
            double average = (double)sum / arr[i].length;

            System.out.print(sum+" | ");
            System.out.println(average);

        }
    }
}

