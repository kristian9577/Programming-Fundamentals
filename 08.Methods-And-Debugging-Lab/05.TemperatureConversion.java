import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double fahrenheit = Double.parseDouble(scan.nextLine());
        double celius = FahrenheitToCelsius(fahrenheit);
        System.out.printf("%.2f", celius);

    }

    private static double FahrenheitToCelsius(double fahrenheit) {
        return ((fahrenheit - 32) * 5) / 9;
    }
}
