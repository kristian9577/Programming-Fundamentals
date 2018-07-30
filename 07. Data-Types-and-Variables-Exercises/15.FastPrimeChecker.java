import java.util.Scanner;

public class FastPrimeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int start = 2; start <= number; start++) {
            boolean isPrime = true;
            for (int divide = 2; divide <= Math.sqrt(start); divide++) {
                if (start % divide == 0) {
                    isPrime = false;
                    break;
                }
            }
            String str = Boolean.toString(isPrime);
            String name = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();

            System.out.printf("%d -> %s%n", start, name);
        }
    }
}
