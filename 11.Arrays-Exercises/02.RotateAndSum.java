import java.util.Scanner;

public class RotateAndSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = ParseArray(scan.nextLine());
        int rotations = Integer.parseInt(scan.nextLine());
        int[] sumArray = new int[arr.length];

        for (int i = 0; i < rotations; i++) {
            Shift(arr);
            Sum(sumArray, arr);
        }
        for (int num : sumArray) {
            System.out.printf("%d ", num);
        }
    }

    static void Sum(int[] sumArray, int[] arr) {
        for (int i = 0; i < sumArray.length; i++) {
            sumArray[i] += arr[i];

        }
    }

    static void Shift(int[] arr) {
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }

    static int[] ParseArray(String input) {

        String[] tokens = input.split(" ");
        int[] result = new int[tokens.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(tokens[i]);
        }
        return result;
    }
}
