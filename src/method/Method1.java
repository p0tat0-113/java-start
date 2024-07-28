package method;

public class Method1 {
    public static void main(String[] args){
        System.out.println(add(2,2));
    }

    //메서드 선언
    //public: 다른 클래스에서 호출할 수 있는 메서드라는 뜻이다. 접근 제어에서 학습 예정
    //static: 객체를 생성하지 않고 호출할 수 있는 정적 메서드라는 뜻이다.
    //int add(int a, int b): int로 반환타입을 정의, add는 메서드 이름, 매개변수들
    public static int add(int a, int b){
        return a+b;
    }
    //제어자 반환타입 메서드이름(매개변수 목록) {
    //  메서드 본문
    //}

    //용어 정리
    //위 코드에서 정수 2처럼 메서드에 넘기는 값을 Argument,인수,인자라고 한다.
    //메서드를 정의할 때 선언한 a,b를 Parameter,파라미터,매개변구라고 한다.
}
