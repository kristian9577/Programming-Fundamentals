import java.text.DecimalFormat;
import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double point1X1 = Double.parseDouble(scan.nextLine());
        double point1Y1 = Double.parseDouble(scan.nextLine());
        double point1X2 = Double.parseDouble(scan.nextLine());
        double point1Y2 = Double.parseDouble(scan.nextLine());

        double point2X1 = Double.parseDouble(scan.nextLine());
        double point2Y1 = Double.parseDouble(scan.nextLine());
        double point2X2 = Double.parseDouble(scan.nextLine());
        double point2Y2 = Double.parseDouble(scan.nextLine());

        double first = LongestLine(point1X1, point1Y1, point1X2, point1Y2);
        double second = LongestLine(point2X1, point2Y1, point2X2, point2Y2);

        if (first >= second) {
            ClosestPoint(point1X1, point1Y1, point1X2, point1Y2);
        } else {
            ClosestPoint(point2X1, point2Y1, point2X2, point2Y2);
        }

    }

    static double LongestLine(double x1, double y1, double x2, double y2) {
        double sum = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return sum;
    }

    static void ClosestPoint(double x1, double y1, double x2, double y2) {

        DecimalFormat df = new DecimalFormat("#.##################");
        double first = Math.sqrt(Math.pow(y1, 2) + Math.pow(x1, 2));
        double second = Math.sqrt(Math.pow(y2, 2) + Math.pow(x2, 2));

        if (first <= second) {
            System.out.printf("(%s, %s)(%s, %s)", df.format(x1), df.format(y1), df.format(x2), df.format(y2));
        } else {
            System.out.printf("(%s, %s)(%s, %s)", df.format(x2), df.format(y2), df.format(x1), df.format(y1));
        }
    }
}
