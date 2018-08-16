import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceofEqualElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = Arrays.stream(scan.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int start = 0;
        int bestStart = 0;
        int length = 0;
        int bestLength = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[start] == nums[i]) {
                length++;
                if (length > bestLength) {
                    bestLength = length;
                    bestStart = start;
                }
            } else {
                start++;
                i = start;
                length = 0;
            }
        }
        for (int i = 0; i <= bestLength; i++) {
            System.out.print(nums[bestStart + i] + " ");
        }
    }
}
