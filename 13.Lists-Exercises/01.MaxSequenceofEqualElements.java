import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxSequenceofEqualElements {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Long> nums = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .map(Long::parseLong).collect(Collectors.toList());
        int countOfEquals = 1;
        long valueOFMaxEquals = 0;
        int countOfMaxSequence = 1;
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) != nums.get(i - 1)) {
                countOfEquals = 1;
            } else {
                countOfEquals++;
                if (countOfEquals > countOfMaxSequence) {
                    countOfMaxSequence = countOfEquals;
                    valueOFMaxEquals = nums.get(i);
                }
            }
        }
        if (countOfMaxSequence == 1) {
            System.out.println(nums.get(0));
        } else {
            long arrayOfEquals[] = new long[countOfMaxSequence];
            for (int i = 0; i < arrayOfEquals.length; i++) {
                arrayOfEquals[i] = valueOFMaxEquals;
                System.out.print(arrayOfEquals[i] + " ");
            }
        }
    }
}