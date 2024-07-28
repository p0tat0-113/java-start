package method;

public class MethodValue1 {
    public static void main(String[] args){
        //자바에는 아주 중요한 규칙이 있다.
        //파이썬 '함수인자전달방식'에 대해서 배웠던 거랑 비슷함. 파이썬은 참조를 통해 전달해서 그 중간과정은 좀 많이 다르지만...
        //자바는 항상 변수의 값을 복사해서 대입한다!
        //add(num);으로 함수를 호출할 때 num1의 값을 복사해서 매개변수 num2로 전달한다.
        //메서드 안의 num2의 변경은 num1에 영향을 주지 못한다. 왜냐하면 값을 복사해서 전달했기 때문.
        //그럼 메서드를 이용해서 값을 바꾸려면 어떻게 해야할까?
        //그냥 return값을 받아서 쓰면 된다.

        int num1 = 10;
        System.out.println(num1);
        add(num1);
        System.out.println(num1);//넘의 값은 그대로임.

        num1 = add(num1);
        System.out.println(num1);//값 바뀜
    }

    public static int add(int num2){
        num2 += 10;
        return num2;
    }
}
