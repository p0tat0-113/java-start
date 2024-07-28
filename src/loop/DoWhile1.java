package loop;

public class DoWhile1 {
    public static void main(String[] args){
        //do {
        //  코드
        //} while (조건식);
        //do-while문은 조건에 관계없이 무조건 한 번은 코드를 실행한다

        int i = 10;
        do {
            System.out.println("hello world");
            i++;
        } while(i < 3); //while의 조건에는 맞지 않지만 그래도 한 번은 실행됨.
    }
}
