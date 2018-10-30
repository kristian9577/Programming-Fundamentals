import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Long> nums = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .map(Long::parseLong).collect(Collectors.toList());

        List<Long> special = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .map(Long::parseLong).collect(Collectors.toList());

        long sum = 0;
        List<Long> finalList = new ArrayList<>();

        while (nums.contains(special.get(0))) {
            finalList.clear();
            for (int i = 0; i < nums.indexOf(special.get(0)) - special.get(1); i++) {
                finalList.add(nums.get(i));
            }
            for (int i = (int) (nums.indexOf(special.get(0)) + special.get(1) + 1); i < nums.size(); i++) {
                finalList.add(nums.get(i));
            }
            nums.clear();
            nums.addAll(finalList);
        }
        for (long x : nums) {
            sum += x;
        }
        System.out.println(sum);
    }
}