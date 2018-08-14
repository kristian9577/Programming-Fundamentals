
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateTriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DecimalFormat format = new DecimalFormat("#.########");

        double widht = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());
        double area = GetTriangleArea(widht, height);

        System.out.println(format.format(area));
    }

    static double GetTriangleArea(double widht, double height) {
        return (widht * height) / 2;
    }
}
