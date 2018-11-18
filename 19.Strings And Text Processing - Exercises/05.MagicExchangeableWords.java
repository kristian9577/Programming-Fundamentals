import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MagicExchangeableWords {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\s+");
        char[] chars1 = input[0].toCharArray();
        char[] chars2 = input[1].toCharArray();
        List<Character> list1 = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < chars1.length; i++) {
            for (int j = 0; j < chars1.length; j++) {
                if (chars1[j] == chars1[i] && !list1.contains(chars1[j])) {
                    count++;
                    list1.add(chars1[i]);
                } else {
                    continue;
                }
            }
        }
        List<Character> list2 = new ArrayList<>();
        int count2 = 0;
        for (int i = 0; i < chars2.length; i++) {
            for (int j = 0; j < chars2.length; j++) {
                if (chars2[j] == chars2[i] && !list2.contains(chars2[j])) {
                    count2++;
                    list2.add(chars2[i]);
                } else {
                    continue;
                }
            }
        }
        if (count == count2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}