package array;

public class Array2 {
    public static void main(String[] args){
        //int[] students;
        //students = new int[5];
        //이걸 이렇게 선언과 동시에 초기화할 수도 있음.
        //int[] students;
        //students = new int[]{100,90,85,70,60};
        //이걸 이렇게 줄일 수 있음
        //int[] students = new int[]{100,90,85,70,60};
        //더 줄일 수 있음
        int[] students = {100,90,85,70,60};

        //배열.length로 배열의 길이를 얻을 수 있음.
        for(int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }
    }
}
