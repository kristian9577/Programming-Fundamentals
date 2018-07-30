import java.util.Scanner;

public class ComparingFloats {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double first = scan.nextDouble();
        double second = scan.nextDouble();
        double eps = 0.000001;
        double dif = second - first;

        if (Math.abs(dif) < eps) {
            System.out.println("True");
        }
        else System.out.println("False");
    }
}
