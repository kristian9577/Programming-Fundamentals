import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int totalSum = 0;
        for (int num : numbers) {
            totalSum += num;
        }
        int leftSum = 0;
        int rightSum = totalSum;
        boolean hasFound = false;

        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            rightSum -= currentNumber;

            if (leftSum == rightSum) {
                System.out.print(i);
                hasFound = true;
                break;
            }
            leftSum += currentNumber;
        }
        if (!hasFound) {
            System.out.println("no");
        }
    }
}

