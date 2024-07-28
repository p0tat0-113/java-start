package casting;

public class Casting3 {
    public static void main(String[] args){
        //형변환은 대입 뿐만 아니라 계산을 할 때도 발생한다.
        //자바에서 계산은 다음 2가지를 기억하자.
        //1. 같은 타입끼리의 계산은 같은 타입의 결과를 낸다.
        //int + int 는 int 를, double + double 은 double 의 결과가 나온다.
        //2. 서로 다른 타입의 계산은 큰 범위로 자동 형변환이 일어난다.
        //int + long 은 long + long 으로 자동 형변환이 일어난다.
        //int + double 은 double + double 로 자동 형변환이 일어난다.

        int div1 = 3/2; //int/int인데 타입도 int니까 그냥 정수 1로 출력
        System.out.println(div1);

        double div2 = 3/2; //int/int인데 타입이 double이라 자동으로 형변환이 되면서 1.0으로 출력
        System.out.println(div2);

        double div3 = 3.0/2; //double/int이므로 double/double로 형변환
        System.out.println(div3);

        double div4 = (double) 3/2; //int/int인데 3이 명시적으로 형변환되면서 double/int -> double/double 형변환
        System.out.println(div4);
    }
}
