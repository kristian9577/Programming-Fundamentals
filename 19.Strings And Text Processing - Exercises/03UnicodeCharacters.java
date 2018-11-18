
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnicodeCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        char[] chars = input.toCharArray();
        for (char c : chars
                ) {
            String unicode = String.format("\\u%04x", (int) c);
            System.out.print(unicode);
        }
    }
}