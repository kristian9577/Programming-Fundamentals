import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double widht=Double.parseDouble(scan.nextLine());
        double height=Double.parseDouble(scan.nextLine());
        double area=widht*height;
        System.out.printf("%.2f",area);
    }
}
