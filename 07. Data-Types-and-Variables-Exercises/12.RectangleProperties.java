import java.text.DecimalFormat;
import java.util.Scanner;

public class RectangleProperties {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        DecimalFormat df=new DecimalFormat("#.#############");
        double perimeter = 2 * a + 2 * b;
        double area = a * b;
        double diagonals = Math.sqrt(a * a + b * b);
        System.out.println(df.format(perimeter));
        System.out.println(df.format(area));
        System.out.println(df.format(diagonals));
    }
}
