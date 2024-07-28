package cond;

public class switch2 {
    public static void main(String[] args){
        //자바 14부터 추가된 새로운 switch문
        //->를 사용하고, 선택된 데이터를 반환할 수 있다.
        int grade = 2;

        int coupon = switch (grade){
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };

        System.out.println(coupon);
    }
}
