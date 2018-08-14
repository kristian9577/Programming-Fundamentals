import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = Double.parseDouble(scan.nextLine());
        double pow = Double.parseDouble(scan.nextLine());
        DecimalFormat df = new DecimalFormat("#.####");

        double sum = RaisedToPowe(num, pow);
        System.out.println(df.format(sum));

    }

    static double RaisedToPowe(double num, double pow) {
        return Math.pow(num, pow);
    }
}
