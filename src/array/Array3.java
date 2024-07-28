package array;

public class Array3 {
    public static void main(String[] args){
        //2차원 배열
        //int[][] arr = new int[2][3];//행,열
        //2차원 배열도 기존 배열처럼 편리하게 초기화 할 수 있다.
        int[][]arr = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
