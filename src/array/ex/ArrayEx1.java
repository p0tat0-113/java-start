package array.ex;

public class ArrayEx1 {
    public static void main(String[] args){
        //int student1 = 90;
        // int student2 = 80;
        // int student3 = 70;
        // int student4 = 60;
        // int student5 = 50;
        // int total = student1 + student2 + student3 + student4 + student5;
        // double average = (double) total / 5;
        // System.out.println("점수 총합: " + total);
        // System.out.println("점수 평균: " + average);
        //다음 문제를 배열을 사용해서 개선하자.

        int[] students = {90,80,70,60,50};

        int sum = 0;
        for(int i : students){
            sum += i;
        }
        System.out.println(sum);
        System.out.println((double)sum/students.length);
        //double/int이므로 자동 형변환이 이루어짐.
    }
}
