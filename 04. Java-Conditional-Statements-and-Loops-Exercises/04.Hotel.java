import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.nextLine();
        int nightsCount = Integer.parseInt(scan.nextLine());

        double studio = 0;
        double doublee = 0;
        double suite = 0;

        switch (month) {
            case "May":
            case "October":
                studio = 50;
                doublee = 65;
                suite = 75;
                break;
            case "June":
            case "September":
                studio = 60;
                doublee = 72;
                suite = 82;
                break;
            case "July":
            case "August":
            case "December":
                studio = 68;
                doublee = 77;
                suite = 89;
                break;
        }
        if (month.equals("May")) {
            if (nightsCount > 7) {
                studio *= 0.95;
            }
        } else if (month.equals("October")) {

            if (nightsCount > 7) {
                studio *= 0.95;
            }
        } else if (month.equals("June")) {
            if (nightsCount > 14) {
                doublee *= 0.9;
            }
        } else if (month.equals("September")) {
            if (nightsCount > 14) {
                doublee *= 0.9;
            }
        } else if (month.equals("July")) {
            if (nightsCount > 14) {
                suite *= 0.85;
            }
        } else if (month.equals("August")) {
            if (nightsCount > 14) {
                suite *= 0.85;
            }
        } else if (month.equals("September")) {
            if (nightsCount > 14) {
                suite *= 0.85;
            }
        }
        double endPriceStudio = studio * nightsCount;
        double endPriceDouble = doublee * nightsCount;
        double endPriceSuite = suite * nightsCount;

        if (month.equals("September")) {
            if (nightsCount > 7) {
                endPriceStudio -=studio;
            }
        }
        if (month.equals("October")) {
            if (nightsCount > 7) {
                endPriceStudio -=studio;
            }
        }
        System.out.printf("Studio: %.2f lv.\n",endPriceStudio);
        System.out.printf("Double: %.2f lv.\n",endPriceDouble);
        System.out.printf("Suite: %.2f lv.",endPriceSuite);
    }
}