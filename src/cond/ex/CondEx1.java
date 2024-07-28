package cond.ex;

public class CondEx1 {
    public static void main(String[] args){
        //학생의 점수를 기반으로 학점을 출력하는 자바 프로그램을 작성하자. 다음과 같은 기준을 따른다.
        //90점 이상: "A"
        //80점 이상 90점 미만: "B"
        //70점 이상 80점 미만: "C"
        //60점 이상 70점 미만: "D"
        //60점 미만: "F"
        //점수는 변수( int score )로 지정하고, 해당 변수를 기반으로 학점을 출력하자.
        int score = 89;

        String result;
        if (score >= 90){
            result = "A";
        } else if (score >= 80) {
            result = "B";
        }else if (score >= 70) {
            result = "C";
        }else if (score >= 60) {
            result = "D";
        }else{
            result = "E";
        }

        System.out.println("score: "+score);
        System.out.println("출력: 학점은 "+result+"입니다.");

    }
}
