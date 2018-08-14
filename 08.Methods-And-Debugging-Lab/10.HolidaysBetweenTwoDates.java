import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HolidaysBetweenTwoDates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d.M.y");

        LocalDate startDate = LocalDate.parse(scan.nextLine(), dateFormat);
        LocalDate endDate = LocalDate.parse(scan.nextLine(), dateFormat);

        int holidaysCount = 0;
        if (endDate.compareTo(startDate) >= 0) {
            for (LocalDate i = startDate; i.compareTo(endDate) <= 0; i = i.plusDays(1)) {
                if (i.getDayOfWeek().name().equals("SATURDAY")){
                    holidaysCount++;
                    continue;
                }
                if (i.getDayOfWeek().name().equals("SUNDAY")){
                    holidaysCount++;
                    i = i.plusDays(5);
                }
            }
        }
        System.out.println(holidaysCount);

    }
}