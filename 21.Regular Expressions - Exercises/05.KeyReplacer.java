import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KeyReplacer {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] keyString = reader.readLine().split("(\\<|\\|)");

        String input = reader.readLine();

        Pattern pattern = Pattern.compile("(" + keyString[0] + ")(.*?)(" + keyString[keyString.length - 1] + ")");
        Matcher matcher = pattern.matcher(input);

        int count = 0;
        while (matcher.find()) {
            if (!matcher.group(2).equals("")) {
                count++;
            }

            System.out.print(matcher.group(2));

        }
        if (count == 0) {
            System.out.println("Empty result");
        }
    }
}