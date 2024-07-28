package method;

public class MethodCasting1 {
    public static void main(String[] args){
        //메서드를 호출할 때도 형변환이 적용된다.
        //메서드를 호출할 때는 전달하는 인수의 타입과 매개변수의 타입이 맞아야 한다.
        //단 타입이 달라도 자동 형변환이 가능한 경우에는 호출할 수 있다.

        double num1 = 10L;
        //test1(num);//double형을 int형 매개변수에 대입하므로 컴파일 에러 발생
        test1((int)num1); //명시적 형변환 필요

        int num2 = 10;
        test2(num2);//int형을 double형 매개변수에 대입하면서 자동으로 형변환이 일어남.
    }

    public static void test1(int num){
        System.out.println(num);
    }

    public static void test2(double num){
        System.out.println(num);
    }
}
