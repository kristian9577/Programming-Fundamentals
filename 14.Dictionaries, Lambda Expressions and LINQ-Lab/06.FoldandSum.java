import java.text.CollationElementIterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FoldandSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int takeElements = numbers.size() / 4;

        List<Integer> leftElements = numbers.stream().limit(takeElements).collect(Collectors.toList());
        List<Integer> middleElements = numbers.stream().skip(takeElements).limit(2 * takeElements).collect(Collectors.toList());
        List<Integer> rightElements = numbers.stream().skip(3 * takeElements).collect(Collectors.toList());

        Collections.reverse(leftElements);
        Collections.reverse(rightElements);

        leftElements.addAll(rightElements);

        int[] result = new int[2 * takeElements];
        int index = 0;

        for (int i = 0; i < result.length; i++) {
            result[index++] = leftElements.get(i) + middleElements.get(i);
        }

        for (int number : result) {
            System.out.printf("%d ", number);
        }
    }
}
