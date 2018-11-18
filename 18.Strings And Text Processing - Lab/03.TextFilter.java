import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] filterWords = scan.nextLine().split(", ");
        String text = scan.nextLine();

        for (String filterWord : filterWords) {
            String replacement = getReplacement(filterWord);
            text = text.replaceAll(filterWord, replacement);
        }

        System.out.println(text);
    }

    private static String getReplacement(String filterWord) {
        StringBuilder replacement = new StringBuilder();

        for (int i = 0; i < filterWord.length(); i++) {
            replacement.append("*");
        }

        return replacement.toString();
    }
}
