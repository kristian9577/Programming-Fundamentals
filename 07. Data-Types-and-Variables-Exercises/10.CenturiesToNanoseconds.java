import java.util.Scanner;
import java.math.BigDecimal;

public class CenturiesToNanoseconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int centuries = scan.nextInt();
        int years = centuries * 100;
        double days = Math.floor(years * 365.2422f);
        int hours = (int) days * 24;
        long minutes = hours * 60;
        long seconds = minutes * 60;
        long miliseconds = seconds * 1000;
        long microseconds = miliseconds * 1000;
        BigDecimal th = new BigDecimal(1000);
        BigDecimal nanoseconds = new BigDecimal(microseconds).multiply(th);
        System.out.print(centuries + " centuries = " + years + " years = ");
        System.out.printf("%.0f days = ", days);
        System.out.print(hours + " hours = " + minutes + " minutes = ");
        System.out.print(seconds + " seconds = " + miliseconds + " milliseconds = ");
        System.out.println(microseconds + " microseconds = " + nanoseconds + " nanoseconds");
    }
}
