package operator;

public class Operator1 {
    public static void main(String[] args){
        int a = 5;
        int b = 4;

        int sum = a+b;
        System.out.println("a+b="+sum);

        int diff = a-b;
        System.out.println("a-b="+diff);

        int multi = a*b;
        System.out.println(multi);

        int div = a/b; //int 형끼리 계산하면 계산결과도 int형을 사용한다. 그래서 소숫점 표현을 못함.
        System.out.println("a/b="+div); //정수 1이 나옴

        int mod = a%b;
        System.out.println("a%b="+mod);
    }
}
