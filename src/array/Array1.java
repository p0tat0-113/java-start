package array;

public class Array1 {
    public static void main(String[] args){
        int[] arr; //배열 변수 선언
        arr = new int[5]; //배열 생성
        //int[] arr = new int[5] 이렇게 한 번에 하는 것도 가능함.

        //배열을 사용하려면 int[] arr;과 같이 배열 변수를 선언해야 한다.
        //배열을 선언한다고해서 사용할 수 있는 배열이 만들어진 것은 아니다.
        //int[] arr;과 같은 배열 변수에는 값이 아니라 배열을 담을 수 있다.

        //배열을 사용하려면 배열을 생성해야 한다.
        //new int[5];라고 입력하면 총 5개의 int형 변수가 만들어진다.
        //자바는 배열을 생성할 때 내부값을 자동으로 초기화한다. 숫자는 0, boolean은 false, String은 null로 초기화

        //new int[5];로 배열을 생성하면 배열의 크기만큼 메모리 공간을 확보한다. int형 5개니까 총 20바이트.
        //배열을 생성하고 나면 자반는 실제로 접근할 수 있는 참조값을 반환한다.
        //앞서 int[] arr;로 선언한 배열 변수에 참조값이 저장된다.
        //아래 코드로 배열의 참조값을 직접 볼 수 있다.
        System.out.println(arr);

        for(int i = 0; i <5; i++){
            arr[i] = i+1;
            System.out.print(arr[i]);
        }

    }
}
