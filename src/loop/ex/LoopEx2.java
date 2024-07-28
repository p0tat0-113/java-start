package loop.ex;

public class LoopEx2 {
    public static void main(String[] args){
        //반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램을 작성해 보세요. 이때, num 이라는 변수를 사용하여 수를
        //표현해야 합니다.
        //while문, for문 2가지 버전의 정답을 만들어야 합니다

        int count = 0;
        int num = 0;
        while (count < 10){
            count++;
            num += 2;
            System.out.println(num);
        }

        //이런식으로 하는 것도 가능하네... 처음 알았다.
        for (count = 0,num = 2; count <10; count++,num+=2){
            System.out.println(num);
        }
    }
}
