import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Snowmen {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> snowManInput = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (snowManInput.size() != 1) {
            List<Integer> snowManToRemove = new ArrayList<>();

            for (int i = 0; i < snowManInput.size() - 1; i++) {
                int attackerIndex = i;
                if (snowManToRemove.contains(attackerIndex)) {
                    continue;
                }
                int targetIndex = snowManInput.get(attackerIndex) % snowManInput.size();
                int difference = Math.abs(attackerIndex - targetIndex);
                int looserIndex = -1;
                int winnerIndex = -1;

                if (attackerIndex == targetIndex) {
                    looserIndex = attackerIndex;
                    System.out.printf("%d performed harakiri\n", attackerIndex);
                } else {
                    if (difference % 2 == 0) {
                        winnerIndex = attackerIndex;
                        looserIndex = targetIndex;
                    } else {
                        winnerIndex = targetIndex;
                        looserIndex = attackerIndex;
                    }
                    System.out.printf("%d x %d -> %d wins\n", attackerIndex, targetIndex, winnerIndex);

                }
                if (!snowManToRemove.contains(looserIndex)) {
                    snowManToRemove.add(looserIndex);
                }
                if (snowManInput.size() == snowManToRemove.size() + 1) {
                    break;
                }
            }
            snowManInput = ClearSnowMan(snowManInput, snowManToRemove);
        }
    }

    private static List<Integer> ClearSnowMan(List<Integer> snowManInput, List<Integer> snowManToRemove) {
        Collections.sort(snowManToRemove, Collections.reverseOrder());
        for (int i = snowManToRemove.size() - 1; i >= 0; i--) {
            snowManInput.remove(i);
        }
        return snowManInput;
    }

}
