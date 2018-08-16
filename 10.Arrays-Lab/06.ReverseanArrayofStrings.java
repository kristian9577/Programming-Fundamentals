import java.util.Scanner;

public class ReverseanArrayofStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] elements = scan.nextLine().split(" ");
        String[] reversedElemnet = new String[elements.length];

        for (int i = 0; i < reversedElemnet.length; i++) {
            reversedElemnet[i] = elements[elements.length - i - 1];
        }
        System.out.println(String.join(" ", reversedElemnet));
    }
}
