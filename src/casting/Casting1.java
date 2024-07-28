package casting;

public class Casting1 {
    public static void main(String[] args){
        //자동 형변환, 묵시적 형변환

        //작은 범위에서 큰 범위로 대입은 허용된다.
        //자바에서 숫자를 표현할 수 있는 범위는 다음과 같다.
        //int < long < double
        //int 보다는 long 이, long 보다는 double 이 더 큰 범위를 표현할 수 있다.
        //double은 long과 같은 바이트의 크기이지만 부동소수점을 사용하기 때문에 더 큰 범위의 숫자를 표현할 수 있다.

        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;
        System.out.println(longValue);

        doubleValue = longValue;
        System.out.println(doubleValue);

        doubleValue = 20L;
        System.out.println(doubleValue);

        //작은 범위에서 큰 범위로의 대입시 아래와 같은 형변환이 자동적으로 이루어진다.
        longValue = (long) intValue;
        System.out.println(longValue);

        doubleValue = (double) longValue;
        System.out.println(doubleValue);
    }
}
