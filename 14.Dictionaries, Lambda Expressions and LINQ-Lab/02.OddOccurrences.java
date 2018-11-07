import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = Arrays.stream(scan.nextLine()
                .split(" "))
                .map(String::toLowerCase)
                .toArray(String[]::new);

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (String inputWord : words) {
            if (map.containsKey(inputWord)) {
                map.put(inputWord, map.get(inputWord) + 1);
            } else {
                map.put(inputWord, 1);
            }
        }

        ArrayList<String> resultWords = new ArrayList<>();
        for (String inputWord : map.keySet()) {
            int counter = map.get(inputWord);
            if (counter % 2 != 0) {
                resultWords.add(inputWord);
            }
        }
        System.out.println(String.join(", ", resultWords));
    }
}
