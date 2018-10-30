import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class ArrayManipulator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        List<Integer> numbers= Arrays.stream(reader.readLine()
//                .split("\\s+"))
//                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numbers = new ArrayList<>();
        String[] nums = reader.readLine().split("\\s+");
        for (String num : nums
                ) {
            numbers.add(Integer.parseInt(num));
        }

        String command = reader.readLine();

        while (!"print".equals(command)) {
            String[] tokens = command.split("\\s+");
            switch (tokens[0]) {
                case "add":
                    int index = Integer.parseInt(tokens[1]);
                    int element = Integer.parseInt(tokens[2]);
                    numbers.add(index, element);
                    break;
                case "addMany":
                    index = Integer.parseInt(tokens[1]);
                    List<Integer> arr = Arrays.stream(tokens).skip(2)
                            .map(Integer::valueOf)
                            .collect(Collectors.toList());
                    numbers.addAll(index, arr);
                    break;
                case "contains":
                    element = Integer.parseInt(tokens[1]);
                    System.out.println(numbers.indexOf(element));
                    break;
                case "remove":
                    index = Integer.parseInt(tokens[1]);
                    numbers.remove(index);
                    break;
                case "shift":
                    int positions = Integer.parseInt(tokens[1]);
                    Collections.rotate(numbers, positions * -1);
                    break;
                case "sumPairs":
                    List<Integer> temp = new ArrayList<>();
                    for (int i = 1; i < numbers.size(); i += 2) {
                        int firts = numbers.get(i);
                        int second = numbers.get(i - 1);
                        temp.add(firts + second);
                    }
                    if (numbers.size() % 2 != 0) {
                        temp.add(numbers.get(numbers.size() - 1));
                    }
                    numbers.clear();
                    numbers.addAll(temp);
                    break;
            }

            command = reader.readLine();
        }
        System.out.println(numbers);
    }
}