import java.util.Scanner;

public class ChooseDrink {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String profession = scan.nextLine();

        if (profession.equals("Athlete")) {
            System.out.println("Water");
        } else if (profession.equals("Businessman")) {
            System.out.println("Coffee");
        } else if (profession.equals("Businesswoman")) {
            System.out.println("Coffee");
        } else if (profession.equals("SoftUni Student")) {
            System.out.println("Beer");
        } else {
            System.out.println("Tea");
        }

    }
}
