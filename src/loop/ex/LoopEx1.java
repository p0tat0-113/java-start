package loop.ex;

public class LoopEx1 {
    public static void main(String[] args){
        //처음 10개의 자연수를 출력하는 프로그램을 작성해 보세요. 이때, count 라는 변수를 사용해야 합니다.
        //while문, for문 2가지 버전의 정답을 만들어야 합니다.

        int i = 0;
        while (i < 10){
            i++;
            System.out.println(i);
        }

        for (i = 1; i <11; i++){
            System.out.println(i);
        }
    }
}
