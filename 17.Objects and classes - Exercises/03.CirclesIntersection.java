import java.util.Scanner;

public class CirclesIntersection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle c1 = new Circle();
        Point center1 = new Point();
        center1.X = scanner.nextInt();
        center1.Y = scanner.nextInt();
        c1.Center = center1;
        c1.Radius = scanner.nextInt();

        Circle c2 = new Circle();
        Point center2 = new Point();
        center2.X = scanner.nextInt();
        center2.Y = scanner.nextInt();
        c2.Center = center2;
        c2.Radius = scanner.nextInt();
        Intersect(c1, c2);

    }

    public static void Intersect(Circle c1, Circle c2) {
        double distanceBetwCenters = Math.sqrt(Math.pow((c1.getCenter().X - c2.getCenter().X), 2) + Math.pow((c1.getCenter().Y - c2.getCenter().Y), 2));
        if (distanceBetwCenters <= c1.Radius + c2.Radius) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

class Circle {
    public Point getCenter() {
        return Center;
    }

    public void setCenter(Point center) {

        Center = center;
    }


    public Point Center = new Point();

    public int getRadius() {
        return Radius;
    }

    public void setRadius(int radius) {
        Radius = radius;
    }

    public int Radius;

}


class Point {
    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int X;

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public int Y;

}
