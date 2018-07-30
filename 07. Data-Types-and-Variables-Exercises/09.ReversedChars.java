import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char first = scan.next().charAt(0);
        char second = scan.next().charAt(0);
        char third = scan.next().charAt(0);

        System.out.printf("%s%s%s",third,second,first);
    }
}
