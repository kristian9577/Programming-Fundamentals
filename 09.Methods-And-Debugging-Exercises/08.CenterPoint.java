import java.text.DecimalFormat;
import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());

        ClosestPoint(x1, y1, x2, y2);
    }

    static void ClosestPoint(double x1, double y1, double x2, double y2) {

        DecimalFormat df = new DecimalFormat("#.##################");
        double first = Math.sqrt(Math.pow(y1, 2) + Math.pow(x1, 2));
        double second = Math.sqrt(Math.pow(y2, 2) + Math.pow(x2, 2));

        if (first <= second) {
            System.out.printf("(%s, %s)", df.format(x1), df.format(y1));
        } else {
            System.out.printf("(%s, %s)", df.format(x2), df.format(y2));
        }
    }
}
