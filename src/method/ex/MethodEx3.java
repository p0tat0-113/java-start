package method.ex;
public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;

       balance = getMoney(balance,1000);//1000원 입금
        balance = putMoney(balance, 2000);//2000원 출금

        System.out.println("최종 잔액: " + balance + "원");
    }

    public static int putMoney(int balance, int depositAmount){
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + (balance+depositAmount));
        return balance+depositAmount;
    }

    public static int getMoney(int balance, int withdrawAmount){
        if (balance >= withdrawAmount){
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + (balance-withdrawAmount));
            return balance-withdrawAmount;
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 하였으나 잔액이 부족합니다.");
            return balance;
        }
    }
}