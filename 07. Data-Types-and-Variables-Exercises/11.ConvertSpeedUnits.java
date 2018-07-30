import java.util.Scanner;

public class ConvertSpeedUnits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int meters = scan.nextInt();
        int hours = scan.nextInt();
        int minutes = scan.nextInt();
        int seconds = scan.nextInt();
        float meterPerSeconds = (float) meters / (hours * 3600 + minutes * 60 + seconds);
        System.out.printf("%f%n", meterPerSeconds);
        float kmPerHours = ((float) meters / 1000) / ((float) hours + (float) minutes / 60 + (float) seconds / 3600);
        System.out.printf("%f%n", kmPerHours);
        float milePerHour = ((float) meters / 1609) / ((float) hours + (float) minutes / 60 + (float) seconds / 3600);
        System.out.printf("%f%n", milePerHour);
    }
}
