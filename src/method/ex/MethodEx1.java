package method.ex;
public class MethodEx1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        double average = getAverage(a,b,c);
        System.out.println(average);
    }

    public static double getAverage(int a,int b, int c){
        double sum = a+b+c;
        double average = sum/3;
        return average;
    }
}