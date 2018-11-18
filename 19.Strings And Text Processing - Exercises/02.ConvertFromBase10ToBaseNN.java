import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;


public class ConvertFromBase10ToBaseNN {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = removeEmptyEntries(reader.readLine().split("\\s+"));
        BigInteger bigInteger = new BigInteger(tokens[0]);
        BigInteger bigInteger1 = new BigInteger(tokens[1]);

        StringBuilder converted = new StringBuilder();
        while (bigInteger.compareTo(BigInteger.valueOf(0)) > 0) {

            BigInteger remainder = bigInteger1.divide(bigInteger);
            converted.append(remainder);
            bigInteger1=bigInteger1.divide(bigInteger);
        }
        StringBuilder reversed = converted.reverse();
        System.out.println(reversed);


    }

    public static String[] removeEmptyEntries(String[] collection) {
        ArrayList<String> nonEmpty = new ArrayList<String>();
        for (String o : collection) {
            if (o.length() > 0) {
                nonEmpty.add(o);
            }
        }
        String[] results = new String[nonEmpty.size()];
        for (int i = 0; i < results.length; i++) {
            results[i] = nonEmpty.get(i);
        }
        return results;
    }

}
