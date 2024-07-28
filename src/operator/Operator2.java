package operator;

public class Operator2 {
    public static void main(String[] args){
        //문자열과 문자열 더하기
        String string1 = "Hello";
        String string2 = "World";
        String result1 = string1+string2;
        System.out.println(result1);

        //문자열과 숫자 더하기
        String result2 = "HelloWorld" + 10;  //숫자가 문자열로 변환된 다음에 더해짐.
        System.out.println(result2);
    }
}
