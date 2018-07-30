import java.util.Scanner;

public class VariableinHexFormat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String n = scan.nextLine();
        int m = Integer.decode(n);
        System.out.println(m);
    }
}
