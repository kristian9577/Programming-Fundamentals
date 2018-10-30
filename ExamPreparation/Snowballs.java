
import java.math.BigInteger;
import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        BigInteger max = BigInteger.valueOf(0);
        int max1 = 0;
        int maxSnow = 0;
        int maxTime = 0;
        int maxQuality = 0;
        int snowballValue = 0;
        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(scan.nextLine());
            int snowballTime = Integer.parseInt(scan.nextLine());
            int snowballQuality = Integer.parseInt(scan.nextLine());
            BigInteger bi2 = BigInteger.valueOf(0);
            for (int j = 0; j < snowballQuality; j++) {
                BigInteger bi1 = BigInteger.valueOf(snowballSnow / snowballTime);
                bi2 = bi1.pow(snowballQuality);
            }
            int res = bi2.compareTo(max);
            if (res == 1) {
                max = bi2;
                maxSnow = snowballSnow;
                maxTime = snowballTime;
                maxQuality = snowballQuality;

            }
        }
        System.out.printf("%d : %d = %d (%d)", maxSnow, maxTime, max, maxQuality);
    }
}
