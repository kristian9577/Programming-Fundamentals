import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SquareNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] inputNumbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        List<Integer> squareNumbers = new ArrayList<>();
        for (int number : inputNumbers) {
            if (Math.sqrt(number) == (int) Math.sqrt(number)) {
                squareNumbers.add(number);
            }
        }
        squareNumbers.stream()
                .sorted((e1, e2) -> Integer.compare(e2, e1))
                .forEach(n -> System.out.printf("%d ", n));
    }
}
