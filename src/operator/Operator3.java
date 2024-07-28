package operator;

public class Operator3 {
    public static void main(String[] args){
        //증감연산자
        int a = 0;
        ++a;
        System.out.println("++a: "+a);
        --a;
        System.out.println("--a: "+a);

        //전위 증감연산자, 후위 증감연산자
        int result = 0;
        int b1 = 0;
        int b2 = 0;

        result = ++b1; //b1의 값을 먼저 증가시키고, 그 결과를 result에 대입한다.
        System.out.println(b1);
        System.out.println(result);

        result = b2++; //b2의 현재값을 result에 대입을 시킨 다음에 b2를 증가시킨다.
        System.out.println(b1);
        System.out.println(result);
    }
}
