import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long num = Long.parseLong(scan.nextLine());

        String str = String.valueOf(isPrime(num));
        str = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        System.out.println(str);

    }

    static boolean isPrime(long num) {
        boolean isPrime = true;
        if (num == 0 || num == 1) {
            isPrime = false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }


}
