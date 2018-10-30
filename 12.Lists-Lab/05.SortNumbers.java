import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Double::parseDouble)
                .sorted()
                .collect(Collectors.toList());

        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                System.out.println(numbers.get(i));
            } else {
                System.out.printf("%f <= ", numbers.get(i));
            }
        }
    }
}
