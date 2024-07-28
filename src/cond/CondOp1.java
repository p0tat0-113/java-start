package cond;

public class CondOp1 {
    public static void main(String[] args){
        //삼항연산자
        //(조건) ? 참_표현식 : 거짓_표현식
        //조건에 만족하면 참표현식, 아니면 거짓표현식
        //단순히 참과 거짓에 따라 특정 값을 구하는 삼항연산자를 사용하면 if문보다 간결한 코드를 작성할 수 있다.
        int age = 20;
        String status = (age >= 19) ? "성인":"애기";
        System.out.println(status);
    }
}
