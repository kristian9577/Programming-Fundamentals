import java.util.Scanner;

public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine().toLowerCase();
        String countWord = scan.nextLine().toLowerCase();

        int counter = 0;
        int index = text.indexOf(countWord);

        while (index != -1) {
            counter++;
            index = text.indexOf(countWord, index + 1);
        }

        System.out.println(counter);
    }
}
