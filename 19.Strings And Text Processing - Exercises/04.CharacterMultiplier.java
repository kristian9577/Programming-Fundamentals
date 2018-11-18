import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterMultiplier {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\s+");
        char[] chars1 = input[0].toCharArray();
        char[] chars2 = input[1].toCharArray();
        int minArr = Math.min(chars1.length, chars2.length);
        int sum = 0;
        for (int i = 0; i < minArr; i++) {
            sum += (int) chars1[i] * (int) chars2[i];
        }
        if (chars1.length > chars2.length) {
            for (int i = minArr; i < chars1.length; i++) {
                sum += (int) chars1[i];
            }
        } else if (chars1.length < chars2.length) {
            for (int i = minArr; i < chars2.length; i++) {
                sum += (int) chars2[i];
            }
        }
        System.out.println(sum);
    }
}