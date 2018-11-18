import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplyBigNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String first = reader.readLine().replaceFirst("^0+(?!$)", "") ;
        String second = reader.readLine().replaceFirst("^0+(?!$)", "") ;

        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int number = 0;
        int remainder = 0;
        for (int i = first.length() - 1; i >= 0; i--) {
            sum = (first.charAt(i) - 48) * Byte.parseByte(second) + remainder;
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