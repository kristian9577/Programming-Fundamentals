
import java.util.Scanner;

public class CubeProperties {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        String type = scan.nextLine();
        System.out.printf("%.2f", Calculate(a, type));
    }

    static double Calculate(double a, String type) {
        double sum = 0;
        switch (type) {
            case "volume":
                sum = Math.pow(a, 3);
                break;
            case "space":
                sum = Math.sqrt(3 * a * a);
                break;
            case "area":
                sum = 6 * a * a;
                break;
            case "face":
                sum = Math.sqrt(2 * a * a);
                break;
        }
        return sum;
    }
}
