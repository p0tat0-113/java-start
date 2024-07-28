package array;

public class Array4 {
    public static void main(String[] args){
        //배열의 크기에 맞춰서 1부터 순서대로 값을 집어넣는 코드

        int[][]arr = new int[10][20];

        int num = 1;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = num++;//후위 증감연산자. 현재 값을 먼저 집어넣은 다음에 증가시킴.
            }
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
