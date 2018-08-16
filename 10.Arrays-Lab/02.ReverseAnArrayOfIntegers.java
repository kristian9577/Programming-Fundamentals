import java.util.Scanner;

public class ReverseAnArrayOfIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = Integer.parseInt(scan.nextLine());
        }
        for (int i = number - 1; i >= 0; i--) {
            System.out.printf("%d ", array[i]);
        }

    }
}
