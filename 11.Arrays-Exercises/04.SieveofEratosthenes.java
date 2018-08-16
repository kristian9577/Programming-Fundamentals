import java.util.Scanner;

public class SieveofEratosthenes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int endNumber = Integer.parseInt(scan.nextLine());
        boolean[] pirmeValues = new boolean[endNumber + 1];

        for (int i = 0; i < pirmeValues.length; i++) {
            pirmeValues[i] = true;
        }
        pirmeValues[0] = true;
        pirmeValues[1] = true;

        for (int i = 2; i < pirmeValues.length; i++) {
            if (pirmeValues[i]) {
                System.out.printf("%d ", i);
                for (int j = 2 * i; j < pirmeValues.length; j += i) {
                    pirmeValues[j] = false;
                }
            }
        }
    }
}
