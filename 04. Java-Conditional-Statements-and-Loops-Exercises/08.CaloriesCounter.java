import java.util.Scanner;

public class CaloriesCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int cheese = 500;
        int tomatoSauce = 150;
        int salami = 600;
        int pepper = 50;
        int count = 0;
        int calories = 0;

        for (int i = 0; i < n; i++) {
            String noun = scan.nextLine();
            if (noun.equalsIgnoreCase("Cheese")) {
                calories += cheese;
            } else if (noun.equalsIgnoreCase("Tomato Sauce")) {
                calories += tomatoSauce;
            } else if (noun.equalsIgnoreCase("Salami")) {
                calories += salami;
            } else if (noun.equalsIgnoreCase("Pepper")) {
                calories += pepper;
            }
            count++;
            if (count == n) {
                System.out.printf("Total calories: %d", calories);
                break;

            }
        }
    }
}

