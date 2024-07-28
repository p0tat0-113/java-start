package casting;

public class Casting2 {
    public static void main(String[] args){
        //명시적 형변환

        //큰 범위에서 작은 범위로의 대입은 소수점 버림, 오버플로우 같은 문제가 발생할 수 있다.
        //큰 범위에서 작은 범위로의 대입은 명시적 형변환이 필요하다.

        double doubleValue = 1.5;
        int intValue;

        //소수점 버려짐
        //intValue = doubleValue; //컴파일 에러 발생
        //java: incompatible types: possible lossy conversion from double to int
        intValue = (int) doubleValue; //명시적 형변환 필요
        System.out.println(intValue);

        //오버플로우
        long maxIntValue = 2147483647; //int타입의 최고값
        long overIntValue = 2147483648L; //int타입의 최고값 초과
        intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println(intValue);

        intValue = (int) overIntValue;
        System.out.println(intValue);//오버플로우 발생 -2147483648출력
        //보통 오버플로우가 발생하면 마치 시계가 한바퀴 돈 것 처럼 다시 처음부터 시작한다.
    }
}
