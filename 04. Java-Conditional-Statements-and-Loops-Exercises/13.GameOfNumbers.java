import java.util.Scanner;

public class GameOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int magicalNumber = Integer.parseInt(scan.nextLine());
        int count = 0;
        int printFirst = 0;
        int printSecond = 0;
        boolean cheak = false;

        for (int i = first; i <= second; i++) {
            for (int j = first; j <= second; j++) {
                count++;
                if ((i + j) == magicalNumber) {
                    printFirst = i;
                    printSecond = j;
                    cheak = true;
                }
            }
        }
        if (cheak == true) {
            System.out.printf("Number found! %d + %d = %d", printFirst, printSecond, printFirst + printSecond);
        } else {
            System.out.printf("%d combinations - neither equals %d", count, magicalNumber);
        }
    }
}
