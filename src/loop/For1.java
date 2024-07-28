package loop;

public class For1 {
    public static void main(String[] args){
        //for (1.초기식; 2.조건식; 4.증감식) {
        //  3.코드
        //}

        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }

        //1부터 max까지 더함.
        int sum = 0;
        int max = 10;
        for (int i = 1; i <= max; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
