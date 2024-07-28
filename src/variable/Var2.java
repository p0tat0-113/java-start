package variable;

public class Var2 {
    public static void main(String[] args){
        //변수에는 다양한 type이 존재한다.

        //정수
        byte a1 = 127; //-128 ~ 127 2^8 1바이트(8비트)
        short a2 = 32767; //-32768 ~ 32767 2^16 2바이트
        //얘네 둘은 표현할 수 있는 범위가 너무 작아서 실무에서는 잘 사용하지 않음. 그리고 자바는 int를 효율적으로 계산하도록 설계돼있다.
        //아 근데 파일 전송할 때 byte를 쓴다고 함.
        int a3 = 2147483647; //-2,147,483,648 ~ 2,147,483,647 (약 21억) 2^32 4바이트
        long a4 = 9223372036854775807L; //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 2^64 8바이트
        //리터럴 끝에 L을 붙여줘야 함.
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        //각 타입 메모리 크기를 초과하는 숫자를 넣으면 integer too large 컴파일 에러가 발생함.

        //실수
        float b = 3.14f; //7자리 정밀도 2^32 4바이트 끝에 리터럴 끝에 f를 붙여줘야 함.
        //정밀도가 낮아서 실무에서 잘 사용하지 않음
        double c = 3.14; //15자리 정밀도 2^64 8바이트
        System.out.println(b);
        System.out.println(c);

        //기타
        boolean d = true; //true,false 1바이트
        char e = 'A'; //문자 하나! 2바이트 작은 따옴표 사용
        //얘도 실무에서는 잘 사용안함. 그냥 String 쓰면 됨.
        String f = "Hello World"; //문자열을 표현, 메모리의 사용량이 문자 길이에 따라 동적으로 달라지는 특별한 타입.
        // 클래스를 배워야 자세히 알 수 있다고 함. 큰 따옴표 사용
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        //리터럴이란?
        //코드에서 개발자가 직접 적은 100 , 10.5 , true , 'A' , "Hello Java" 와 같은 고정된 값을 프로그래밍 용어로 리터럴(literal)이라 한다.
        //변수의 값은 변할 수 있지만 리터럴은 개발자가 직접 입력한 고정된 값이다. 그냥 알고 넘어가면 된다고 함.

        //요즘은 메모리 용량은 매우 저렴하다. 그러니까 용량을 약간 절약하기보다는 개발 속도나 효율에 초점을 맞추는게 더 중요하다고 한다.
    }
}
