import java.util.Scanner;

public class ChooseDrinck2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String profession=scan.nextLine();
        int quantity=Integer.parseInt(scan.nextLine());
        double price=0;
        if (profession.equals("Athlete")) {
            price=0.7;
        } else if (profession.equals("Businessman")) {
            price=1;
        } else if (profession.equals("Businesswoman")) {
            price=1;
        } else if (profession.equals("SoftUni Student")) {
            price=1.7;
        } else {
            price=1.2;
        }
        System.out.printf("The "+profession+" has to pay %.2f.",price*quantity);
    }

}
