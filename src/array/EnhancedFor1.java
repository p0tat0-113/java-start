package array;

public class EnhancedFor1 {
    public static void main(String[] args){
        //향상된 for문, for-each문이라고도 함.

        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        }

        //향상된 for문. :오른편에는 탐색할 배열, :왼편에는 반복할 때마다 찾은 값을 저장할 변수
        for(int i : arr){
            System.out.print(i);
        }
    }
}
