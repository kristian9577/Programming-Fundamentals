import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class SumReversedNumbers {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));

        long result = Arrays.stream(reader.readLine().split("\\s+"))
                .map(text -> new StringBuilder(text).reverse().toString())
                .mapToInt(Integer::parseInt)
                .sum();
        System.out.println(result);
    }
}