
import java.util.Scanner;


public class LargestCommonEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arr1 = scan.nextLine().split(" ");
        String[] arr2 = scan.nextLine().split(" ");

        int ednIndex = Math.min(arr1.length, arr2.length);
        int leftCounter = 0;
        int rightCounter = 0;

        for (int i = 0; i < ednIndex; i++) {
            if (arr1[i].equals(arr2[i])) {
                leftCounter++;
            }

            if (arr1[arr1.length - 1 - i].equals(arr2[arr2.length - 1 - i])) {
                rightCounter++;
            }
        }
        int max = Math.max(leftCounter, rightCounter);
        System.out.println(max);
    }
}
