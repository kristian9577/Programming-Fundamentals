import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ConvertFromBase10ToBaseN {
    public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); //Instead Scanner

    public static void main(String args[]) throws IOException {
        List<String> enter = Arrays.stream(input.readLine().split(" ")).collect(Collectors.toList());
        System.out.println(fromNto10(enter.get(0), enter.get(1)));


    }

    public static BigInteger fromNto10(String nString, String numberString) {
        BigInteger numberN = new BigInteger("1");
        BigInteger result = new BigInteger("0");
        for (int i = numberString.length() - 1; i >= 0; i--) {
            BigInteger current = new BigInteger("" + numberString.charAt(i));
            result = result.add(current.multiply(numberN));
            numberN = numberN.multiply(new BigInteger(nString));
        }
        return result;
    }
}
