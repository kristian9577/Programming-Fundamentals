import java.util.Scanner;

public class PracticeIntegerNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        short c = Short.parseShort(scan.nextLine());
        int d = Integer.parseInt(scan.nextLine());
        long e = Long.parseLong(scan.nextLine());
        int i = Integer.parseInt(scan.nextLine());
        long k = Long.parseLong(scan.nextLine());

        System.out.printf(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + i + "\n" + k + "\n");
    }
}
