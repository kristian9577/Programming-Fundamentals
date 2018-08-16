import java.util.Arrays;
import java.util.Scanner;

public class SumArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr1 = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int maxLenght = Math.max(arr1.length, arr2.length);
        int[] sumArray = new int[maxLenght];

        for (int i = 0; i < maxLenght; i++) {
            sumArray[i] = arr1[i % arr1.length] + arr2[i % arr2.length];

        }

        for (int num : sumArray) {
            System.out.printf("%d ", num);
        }

    }
}
