import java.util.Scanner;

public class IntervalOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());

        if (n > m) {
            for (int i = m; i <= n; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = n; i <= m; i++) {
                System.out.println(i);
            }
        }
    }
}
