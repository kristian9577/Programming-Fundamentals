import java.util.Scanner;

public class NumbersInReversedOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String number = scan.nextLine();

        String reverse = new StringBuffer(number).reverse().toString();
        System.out.println(reverse);
    }
}
