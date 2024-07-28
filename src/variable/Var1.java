package variable;//첫줄에 소속된 패키지를 선언해줘야한다.

public class Var1 {
    public static void main(String[] args){
        //변수를 선언하면 컴퓨터의 메모리 공간을 확보해서 그곳에 데이터를 저장할 수 있다. 그리고 변수의 이름을 이용해서 메모리 공간에 접근

        int a; //변수 선언 interger를 보관할 수 있는 a라는 이름의 데이터 저장소를 만듦
        a = 10; //변수 초기화. 변수에 값을 대입한다 라고 표현
        System.out.println(a);
        a = 20; //변수 값을 변경할 수도 있음
        System.out.println(a);

        int c = 10,d = 20; //변수는 이렇게 선언과 동시에 초기화 할수도 있고 여러 변수를 동시에 하는 것도 가능하다.
        System.out.println(c);
        System.out.println(d);

        int e; //참고-이렇게 선언만하고 사용하지 않은 변수는 컴파일 단계에서 다 없애버림(최적화)
        //System.out.println(e); //variable e might not have been initialized 컴파일 에러가 발생
        /*변수를 선언하면 메모리 상의 어떤 공간을 차지하고 사용한다. 근데 그 공간에 원래 어떤 값이 있었는지 몰라서,
        초기화 하지 않으면 이상한 값이 출력될 수 있다. 그래서 자바는 변수를 초기화 하도록 강제함.*/

        //참고로 지금 학습하는 변수는 지역변수라고 하는데 지역변수는 개발자가 직접 초기화를 해줘야 한다.
        //나중에 배울 클래스변수와 인스턴스 변수는 자동으로 초기화를 진행해준다.
    }
}
