import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SearchforaNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int[] threeNumer = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();


        List<Integer> numbers1 = new ArrayList<>();
        for (int i = 0; i < threeNumer[0]; i++) {
            numbers1.add(numbers.get(i));
        }
        if (threeNumer[1] < numbers1.size()) {
            for (int i = 0; i < threeNumer[1]; i++) {
                numbers1.remove(0);
            }
        } else {
            for (int i = 0; i < numbers1.size(); i++) {
                numbers1.remove(0);
            }
        }

        if (numbers1.indexOf(threeNumer[2]) != -1) {
            System.out.println("YES!");
        } else {
            System.out.println("NO!");
        }
    }

}