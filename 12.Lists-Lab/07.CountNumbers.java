import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());

        int currentNumber = numbers.get(0);
        numbers.remove(0);
        int currentCounter = 1;
        for (Integer number : numbers) {
            if (number == currentNumber) {
                currentCounter++;
            } else {
                System.out.printf("%d -> %d%n", currentNumber, currentCounter);
                currentNumber = number;
                currentCounter = 1;

            }
        }
        System.out.printf("%d -> %d", currentNumber, currentCounter);
    }
}
