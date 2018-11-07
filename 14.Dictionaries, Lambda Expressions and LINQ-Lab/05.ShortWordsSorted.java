import java.util.Arrays;
import java.util.Scanner;

public class ShortWordsSorted {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = Arrays.stream(scan.nextLine()
                .split("[\\\\,:;.!()\"'/\\[\\]\\s+]+"))
                .map(String::toLowerCase)
                .filter(w -> w.length() < 5)
                .sorted()
                .distinct()
                .toArray(String[]::new);

        System.out.println(String.join(", ", words));
    }
}
