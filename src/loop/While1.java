package loop;

public class While1 {
    public static void main(String[] args){
        //while 반복문
        //while (조건식) {
        //  코드
        //}

        int i = 0;
        while (i < 3){
            i++;
            System.out.println(i);
        }

        //1부터 max까지 더하는 while반복문
        i = 1;
        int max = 10;
        int sum = 0;
        while (i <= max){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
