import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] usernames = reader.readLine().split("\\s+|\\/|\\\\|\\(|\\)");

        String regex = "\\b([a-zA-Z]+(\\w*|[0-9]*)){3,25}\\b";
        Pattern pattern = Pattern.compile(regex);

        List<String> validUsernames = new ArrayList<>();

        for (int i = 0; i < usernames.length; i++) {
            Matcher matcher = pattern.matcher(usernames[i]);
            while (matcher.find()) {
                validUsernames.add(matcher.group(0));
            }
        }

        List<Integer> usernamesLengths = new ArrayList<>();

        for (int i = 0; i < validUsernames.size() - 1; i++) {
            usernamesLengths.add(validUsernames.get(i).length() + validUsernames.get(i + 1).length());
        }
        int max = Collections.max(usernamesLengths);
        int indexofMax = usernamesLengths.indexOf(max);

        System.out.println(validUsernames.get(indexofMax));
        System.out.print(validUsernames.get(indexofMax + 1));
    }
}