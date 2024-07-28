package operator;

public class Operator4 {
    public static void main(String[] args){
        //비교 연산자와 논리 연산자

        //비교 연산자
        int a = 10;
        int b = 20;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        boolean result = a != b;
        System.out.println(result);
        System.out.println("------------------------------");

        //문자열 비교
        //문자열이 같은지 비교할 때는 ==이 아니라 .equals()메서드를 써야한다.
        //==를 사용하면 성공할 때도 있지만 실패할 때도 있다고 한다. 지금 수준에서는 이해하기 어려운 부분임.

        String string1 = "Hello";
        String string2 = "Hello";
        System.out.println(string1.equals(string2));
        System.out.println("world".equals("world"));
        System.out.println("------------------------------");

        //논리 연산자 && || !
        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(!true);

        //a가 5이상 15이하의 숫자인지 판단
        System.out.println(a >= 5 && a <= 15);
    }
}
