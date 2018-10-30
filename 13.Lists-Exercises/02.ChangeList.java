import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class ChangeList {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numbers = new ArrayList<>();

        String[] nums = reader.readLine().split("\\s+");

        for (String num : nums) {
            numbers.add(Integer.parseInt(num));
        }
        String command = reader.readLine();

        while (!"Odd".equals(command) && !"Even".equals(command)) {
            String[] tokens = command.split("\\s+");
            switch (tokens[0]) {
                case "Delete":
                    int deleteNumber = Integer.parseInt(tokens[1]);
                    for (int i = numbers.size() - 1; i >= 0; i--) {
                        if (numbers.get(i) == deleteNumber) {
                            numbers.remove(i);
                        }
                    }
                    break;
                case "Insert":
                    int element = Integer.parseInt(tokens[1]);
                    int position = Integer.parseInt(tokens[2]);
                    numbers.add(position, element);
                    break;
            }

            command = reader.readLine();
        }
        if ("Odd".equals(command)) {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 != 0) {
                    System.out.print(numbers.get(i) + " ");
                }
            }
        } else if ("Even".equals(command)) {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 == 0) {
                    System.out.print(numbers.get(i) + " ");
                }
            }
        }
    }
}