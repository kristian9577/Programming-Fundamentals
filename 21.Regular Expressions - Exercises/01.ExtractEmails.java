import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final String regex = "\\s[A-Za-z0-9]+([.\\-_]?[A-Za-z0-9]+)*\\@([a-zA-Z]+[\\-]?[a-zA-Z]+\\1*)(\\.[a-zA-Z]+-?[a-zA-Z]+\\3*){1,}";
        final String string = reader.readLine();
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.println(matcher.group(0));

        }
    }
}