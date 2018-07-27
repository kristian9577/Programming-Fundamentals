import java.util.Scanner;

public class CountTheIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;

        try {
            while (true) {
               int number = Integer.parseInt(scan.nextLine());
                count++;
            }
        } catch (Exception ex) {
            System.out.println(count);
        }
    }
}
