import java.util.Scanner;

public class ExchangeVariableValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int five = 5;
        int ten = 10;
        System.out.println("Before:");
        System.out.println("a = " + five);
        System.out.println("b = " + ten);
        int tem = 5;
        five = ten;
        ten = tem;
        System.out.println("After:");
        System.out.println("a = " + five);
        System.out.println("b = " + ten);
    }
}
