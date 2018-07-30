import java.util.Scanner;

public class BooleanVariable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        boolean var = Boolean.parseBoolean(word);
        if (var == true) {
            System.out.println("Yes");
        } else if (var == false) {
            System.out.println("No");

        }
    }
}
