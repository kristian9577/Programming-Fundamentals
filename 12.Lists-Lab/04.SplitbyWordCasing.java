import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SplitbyWordCasing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] allWords = Arrays.stream(scan.nextLine().split("[\\\\,:;.!()\"'/\\[\\]\\s]+"))
                .filter(w -> w.length() > 0) //remove empty entries
                .toArray(String[]::new);

        ArrayList<String> lowerCaseWord = new ArrayList<>();
        ArrayList<String> mixedCaseWord = new ArrayList<>();
        ArrayList<String> upperCaseWord = new ArrayList<>();

        for (String word : allWords) {
            if (isUpperCase(word)) {
                upperCaseWord.add(word);
            } else if (isLowerCase(word)) {
                lowerCaseWord.add(word);
            } else {
                mixedCaseWord.add(word);
            }
        }

        System.out.printf("Lower-case: %s%n", String.join(", ", lowerCaseWord));
        System.out.printf("Mixed-case: %s%n", String.join(", ", mixedCaseWord));
        System.out.printf("Upper-case: %s%n", String.join(", ", upperCaseWord));
    }

    private static boolean isLowerCase(String word) {
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (!Character.isLowerCase(currentChar)) {
                return false;
            }
        }
        return true;
    }


    static boolean isUpperCase(String word) {
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (!Character.isUpperCase(currentChar)) {
                return false;
            }
        }
        return true;
    }
}
