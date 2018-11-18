
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumBigNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String first = reader.readLine().trim();
        String second = reader.readLine().trim();
        if (first.length() > second.length()) {
            second = String.format("%0" + (first.length() - second.length()) + "d%s", 0, second);
        } else if (first.length() < second.length()) {
            first = String.format("%0" + (second.length() - first.length()) + "d%s", 0, first);
        }
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int number = 0;
        int remainder = 0;
        for (int i = first.length() - 1; i >= 0; i--) {
            sum = first.charAt(i) - 48 + second.charAt(i) - 48 + remainder;
            number = sum % 10;
            sb.append(number);
            remainder = sum / 10;
            if (i == 0 && remainder > 0) {
                sb.append(remainder);
            }
        }
        System.out.println(sb.reverse());
    }
}