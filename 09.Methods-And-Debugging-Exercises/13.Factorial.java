import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        BigInteger factorial = BigInteger.valueOf(number);

        for (int i = number; i > 1; i--) {
            BigInteger test = BigInteger.valueOf(i - 1);
            factorial = factorial.multiply(test);
        }
        System.out.println(factorial);
    }

    }

