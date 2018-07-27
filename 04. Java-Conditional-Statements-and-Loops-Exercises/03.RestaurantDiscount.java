import java.util.Scanner;

public class RestaurantDiscount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int groupSize = Integer.parseInt(scan.nextLine());
        String packagee = scan.nextLine();

        String Hall = "";
        int price = 0;
        double discount = 0;
        int packageePrice = 0;

        if (groupSize <= 50) {
            price = 2500;
            Hall = "Small Hall";
        } else if (groupSize > 50 && groupSize <= 100) {
            price = 5000;
            Hall = "Terrace";
        } else if (groupSize > 100 && groupSize <= 120) {
            price = 7500;
            Hall = "Great Hall";
        }

        if (packagee.equals("Normal")) {
            discount = 0.05;
            packageePrice = 500;
        } else if (packagee.equals("Gold")) {
            discount = 0.1;
            packageePrice = 750;
        } else if (packagee.equals("Platinum")) {
            discount = 0.15;
            packageePrice = 1000;
        }
        int totalPrice = price + packageePrice;
        double totalMoney = totalPrice - totalPrice * discount;
        double priceForOne = totalMoney / groupSize;
        if (groupSize <= 120) {
            System.out.println("We can offer you the " + Hall);
            System.out.printf("The price per person is %.2f$", priceForOne);
        } else {
            System.out.println("We do not have an appropriate hall.");
        }
    }
}
