package cond.ex;

public class CondEx2 {
    public static void main(String[] args){
        //주어진 거리에 따라 가장 적합한 운송 수단을 선택하는 프로그램을 작성하자. 다음과 같은 기준을 따른다.
        //거리가 1km 이하이면: "도보"
        //거리가 10km 이하이면: "자전거"
        //거리가 100km 이하이면: "자동차"
        //거리가 100km 초과이면: "비행기"
        //거리는 변수( int distance )로 지정하고, 해당 변수를 기반으로 운송 수단을 출력하자.

        int distance = 101;

        String result;
        if (distance <= 1){
            result = "도보";
        } else if (distance <= 10) {
            result = "자전거";
        }else if (distance <= 100) {
            result = "자동차";
        }else{
            result = "비행기";
        }

        System.out.println("distance: "+ distance);
        System.out.println("출력: "+result+"를 이용하세요.");
    }
}
