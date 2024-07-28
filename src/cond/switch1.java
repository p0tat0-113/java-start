package cond;

public class switch1 {
    public static void main(String[] args){
        //switch문
        //switch문은 if문을 조금 더 편리하게 사용할 수 있는 기능이다.
        //if문은 비교연산자를 사용할 수 있지만, switch문은 단순히 값이 같은지만 비교할 수 있다.

        //grade 1:1000 2:2000 3:3000 나머지:500
        int grade = 2;

        int coupon;
        switch(grade){ //조건식
            case 1: //조건식의 결과 값이 1일 때 코드 실행
                coupon = 1000;
                break;
            case 2: //만약 이렇게 break문이 없다면 중단하지 않고 바로 다음에 있는 case 3:의 코드를 실행한다.
            case 3:
                coupon = 3000;
                break;
            default: //조건식의 결과 위의 어떤 값도 해당하지 않을 때 코드 실행
                coupon = 500;
        }
        System.out.println(coupon);
    }
}
