import java.util.Arrays;
import java.util.Scanner;

public class TripleSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] nums = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean hasFound = false;
        for (int curentIndex = 0; curentIndex < nums.length; curentIndex++) {
            for (int nextIndex = curentIndex + 1; nextIndex < nums.length; nextIndex++) {
                int sum = nums[curentIndex] + nums[nextIndex];

                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == sum) {
                        System.out.printf("%d + %d == %d%n", nums[curentIndex], nums[nextIndex], sum);
                        hasFound = true;
                        break;
                    }
                }
            }

        }
        if (hasFound == false) {
            System.out.println("No");
        }
    }
}
