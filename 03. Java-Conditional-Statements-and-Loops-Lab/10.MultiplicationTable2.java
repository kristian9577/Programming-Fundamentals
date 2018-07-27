import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int multiplier = Integer.parseInt(scan.nextLine());
        int product = 0;

        if (multiplier <= 10) {
            for (int i = multiplier; i <= 10; i++) {
                product = number * i;
                System.out.println(number + " X " + i + " = " + product);

            }
        } else {
            product = number * multiplier;
            System.out.println(number + " X " + multiplier + " = " + product);
        }
    }
}
