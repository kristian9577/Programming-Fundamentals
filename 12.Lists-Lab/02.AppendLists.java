import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AppendLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\|");

        List<String> list = new ArrayList<>();

        for (int i = input.length - 1; i >= 0; i--) {
            String[] tokens = input[i].trim().split("\\s+");

            list.addAll(Arrays.asList(tokens));
        }
        System.out.println(String.join(" ", list));
    }
}
