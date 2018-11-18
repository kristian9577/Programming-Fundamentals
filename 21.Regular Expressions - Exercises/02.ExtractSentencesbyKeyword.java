import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractSentencesbyKeyword {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String keyWord = reader.readLine();

        final String regex = "\\b[^?.!]*\\b" + keyWord + "\\b[^?.!]*";
        final String string = reader.readLine();

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println(matcher.group(0));

        }
    }
}