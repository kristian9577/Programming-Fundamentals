import java.util.Scanner;

public class DayofWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        String[] dayOfWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (number < 1 || number > 7) {
            System.out.println("Invalid Day");
        } else {
            System.out.println(dayOfWeek[number - 1]);
        }

    }
}
