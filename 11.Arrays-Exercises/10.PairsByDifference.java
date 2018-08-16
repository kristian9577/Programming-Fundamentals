import java.util.Arrays;
import java.util.Scanner;

public class PairsByDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays.stream(scan.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int diff = Integer.parseInt(scan.nextLine());
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] - arr[j] == diff) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
