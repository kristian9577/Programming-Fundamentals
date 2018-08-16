import java.util.Scanner;

public class CompareCharArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] arr1 = scan.nextLine().replaceAll(" ", "").toCharArray();
        char[] arr2 = scan.nextLine().replaceAll(" ", "").toCharArray();
        boolean equal = true;
        int checkLenght = 0;

        if (arr2.length > arr1.length) {
            checkLenght = arr1.length;
        } else if (arr2.length <= arr1.length) {
            checkLenght = arr2.length;
        }
        for (int i = 0; i < checkLenght; i++) {
            if (arr1[i] == arr2[i]) {
                continue;
            } else if (arr1[i] < arr2[i]) {
                PrintArray(arr1);
                PrintArray(arr2);
                return;
            } else {
                PrintArray(arr2);
                PrintArray(arr1);
                return;
            }
        }
        if (arr1.length <= arr2.length) {
            PrintArray(arr1);
            PrintArray(arr2);
            return;
        } else if (arr1.length > arr2.length) {
            PrintArray(arr2);
            PrintArray(arr1);
            return;
        }
    }

    public static void PrintArray(char[] chars) {
        for (char x : chars
                ) {
            System.out.print(x);
        }
        System.out.println();
    }
}
