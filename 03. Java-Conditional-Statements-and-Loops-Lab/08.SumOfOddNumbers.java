import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = 1; i <= 2 * n; i += 2) {
                sum += i;
                System.out.println(i);
        }
        System.out.printf("Sum: %d", sum);
    }
}
