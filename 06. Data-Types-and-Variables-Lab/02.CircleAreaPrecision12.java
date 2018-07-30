import java.util.Scanner;

public class CircleAreaPrecision12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r=Double.parseDouble(scan.nextLine());
        System.out.printf("%.12f",Math.PI*r*r);
    }
}
