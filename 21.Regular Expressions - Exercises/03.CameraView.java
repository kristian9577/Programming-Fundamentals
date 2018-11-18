import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CameraView {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] ints=new int[2];

        ints= Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String []input = reader.readLine().split("(\\|\\<)");

        for (int i = 1; i <input.length-1 ; i++) {
            try{
                System.out.print(input[i].substring(ints[0],(ints[0]+ints[1]))+", ");
            }
            catch (IndexOutOfBoundsException e){
                System.out.print(input[i].substring(ints[0])+", ");
            }

        }
        for (int i = input.length-1; i <input.length ; i++) {
            try{
                System.out.print(input[i].substring(ints[0],(ints[0]+ints[1])));
            }
            catch (IndexOutOfBoundsException e){
                System.out.print(input[i].substring(ints[0]));
            }

        }
    }
}
