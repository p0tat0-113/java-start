package loop;

public class BreakContinue1 {
    public static void main(String[] args){
        int i = 0;
        while(true){
            i++;
            System.out.println(i);
            if (i >= 3){
                break;//반복문을 종료하고 나감.
            }
        }

        i = 0;
        while(i < 5){
            i++;
            if (i ==3){
                continue;//조건문의 맨 앞으로 이동
            }
            System.out.println(i);
        }
    }
}
