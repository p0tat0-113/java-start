package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args){
        //사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균을 계산하는 프로그램을 작성하자.
        //2차원 배열을 사용하고, 실행 결과 예시를 참고하자.

        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[4][3];

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

