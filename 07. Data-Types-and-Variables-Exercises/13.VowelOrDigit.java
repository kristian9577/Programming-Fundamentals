import java.util.Scanner;

public class VowelOrDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char symbol = scan.next().charAt(0);
        if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
            System.out.println("vowel");
        } else if (symbol >= 48 && symbol <= 57) {
            System.out.println("digit");
        } else {
            System.out.println("other");
        }
    }
}
