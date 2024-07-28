package method;

public class MethodReturn1 {
    public static void main(String[] args){
        boolean result = odd(5);
        System.out.println(result);
    }

    //반환타입이 있는 메서드는 반드시 반환을 해야한다.
    //특히 조건문을 사용할 때 주의해야한다.
    public static boolean odd(int num){
        if(num%2 == 1){
            return true;
        }
        return false;//만약 이 부분이 없으면 컴파일 오류가 발생함.
    }
}
