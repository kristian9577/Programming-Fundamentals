import java.math.BigInteger;
import java.util.Scanner;

public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        BigInteger factorial = BigInteger.valueOf(n);

        System.out.println(findTrailingZeros(n));
    }


    static int findTrailingZeros(int n) {
        // Initialize result
        int count = 0;

        // Keep dividing n by powers
        // of 5 and update count
        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;

        return count;
    }
}