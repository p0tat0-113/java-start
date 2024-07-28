package method;

public class Method2 {
    public static void main(String[] args){
        //매개변수나 반환 타입이 없는 경우
        printHeader();
        printFooter();
    }

    public static void printHeader(){
        System.out.println("=Header=");
        return; //void라서 생략해도 됨.
    }

    public static void printFooter(){
        System.out.println("=Footer=");
    }

    //void와 return생략
    //모든 메서드는 return을 호출해야 한다. 그런데 반환 타입 void의 경우에는 예외로 생략해도 된다.
}
