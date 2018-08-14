import java.util.Scanner;

public class MaxMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        int thirdNumber = Integer.parseInt(scan.nextLine());

        int max = GetMax(firstNumber, secondNumber);
        max = GetMax(max, thirdNumber);
        System.out.println(max);

    }

    static int GetMax(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }
}
