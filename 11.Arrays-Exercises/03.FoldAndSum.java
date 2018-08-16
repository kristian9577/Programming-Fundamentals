import java.util.Arrays;
import java.util.Scanner;

public class FoldAndSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays.stream(scan.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int k = arr.length / 4;
        int[] left = GetPart(arr, k, 0);
        int[] middle = GetPart(arr, 2 * k, k);
        int[] right = GetPart(arr, k, 3 * k);


        int[] leftReversed = ReversedArray(left);
        int[] rightReversed = ReversedArray(right);

        int[] merged = new int[2 * k];
        int index = 0;

        for (int i = 0; i < k; i++) {
            merged[index++] = leftReversed[i];
        }
        for (int i = 0; i < k; i++) {
            merged[index++] = rightReversed[i];
        }

        for (int i = 0; i < middle.length; i++) {
            int sum = middle[i] + merged[i];
            System.out.printf("%d ", sum);
        }
        System.out.println();
    }

    private static int[] GetPart(int[] arr, int size, int startIndex) {
        int[] part = new int[size];
        for (int i = startIndex; i < size + startIndex; i++) {
            part[i - startIndex] = arr[i];
        }
        return part;
    }

    private static int[] ReversedArray(int[] arr) {
        int[] reversedElemnet = new int[arr.length];

        for (int i = 0; i < reversedElemnet.length; i++) {
            reversedElemnet[i] = arr[arr.length - i - 1];
        }
        return reversedElemnet;
    }

}

