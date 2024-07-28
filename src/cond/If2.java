package cond;

public class If2 {
    public static void main(String[] args){
        int age = 16;

        if (age < 8){
            System.out.println("애새끼입니다.");
        } else if(age <= 13){
            System.out.println("초딩");
            //else if문은 앞의 조건이 false일 때 실행되므로 굳이 age >= 8 && age <=13이렇게 쓰지 않아도 됨.
        } else if(age <= 16){
            System.out.println("중딩");
        } else if(age <= 19) {
            System.out.println("고딩");
        } else{
            System.out.println("성인");
        }
    }
}



