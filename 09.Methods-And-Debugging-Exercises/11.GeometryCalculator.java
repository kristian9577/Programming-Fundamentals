import java.util.Scanner;

public class GeometryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shape = scan.nextLine();
        double area = 0;

        if (shape.equals("triangle")) {
            double side = Double.parseDouble(scan.nextLine());
            double height = Double.parseDouble(scan.nextLine());

            area = side * height / 2;
        } else if (shape.equals("square")) {
            double side = Double.parseDouble(scan.nextLine());

            area = side * side;
        } else if (shape.equals("rectangle")) {
            double width = Double.parseDouble(scan.nextLine());
            double height = Double.parseDouble(scan.nextLine());

            area = width * height;
        } else if (shape.equals("circle")) {
            double radius = Double.parseDouble(scan.nextLine());

            area = Math.PI * radius * radius;
        }
        System.out.printf("%.2f", area);
    }
}

