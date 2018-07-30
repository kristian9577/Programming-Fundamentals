import java.util.Scanner;

public class IntegertoHexandBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String hex = Integer.toHexString(number);
        String binary = Integer.toBinaryString(number);
        System.out.println(hex.toUpperCase());
        System.out.println(binary);
    }
}
