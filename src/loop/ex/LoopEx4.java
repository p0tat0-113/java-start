package loop.ex;

public class LoopEx4 {
    public static void main(String[] args){
        //중첩 for문을 사용해서 구구단을 완성해라

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.println(i + " * " + j + " = "+ i*j);
            }
        }
    }
}
