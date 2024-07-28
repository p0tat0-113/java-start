package method;

public class MethodReturn2 {
    public static void main(String[] args){
        check(20);
    }

    //return문을 만나면 그 즉시 메서드를 빠져나간다.
    public static void check(int num){
        if (num < 19){
            System.out.println("입장불가");
            return; //메서드를 빠져나감. 따라서 밑에 '입장'출력은 생략됨.
        }
        System.out.println("입장");

    }
}
