package method;

public class Overloading1 {
    public static void main(String[] args){
        //메서드 오버로딩: 이름이 같고 매개변수가 다른 메서드를 여러개 정의하는 것
        //메서드의 이름이 같아도, 매개변수의 타입 및 순서가 다르면 오버로딩을 할 수 있다. 반환 타입은 인정하지 않음.
        //메서드 시그니처 = 메서드 이름 + 매개변수 타입(순서)
        //메서드 시그니처는 자바에서 메서드를 구분할 수 있는 고유한 식별자나 서명을 뜻한다.
        add1(10,10);
        add1(10L,10L);
        add2(1,2);
        add2(1,2,3);
    }

    public static void add1(int a, int b){
        System.out.println("int a int b");
    }
    public static void add1(double a, double b){
        System.out.println("double a double b");
    }

    public static void add2(int a, int b){
        System.out.println("int a int b");
    }
    public static void add2(int a, int b, int c){
        System.out.println("int a int b int c");
    }




}
