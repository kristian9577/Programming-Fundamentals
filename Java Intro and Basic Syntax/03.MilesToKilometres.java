import java.util.Scanner;

public class MilesToKilometres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double miles=Double.parseDouble(scan.nextLine());
        double kilo=miles*1.60934;
        System.out.printf("%.2f",kilo);
    }
}
