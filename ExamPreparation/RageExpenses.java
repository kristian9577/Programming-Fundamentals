import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double headsets = (lostGamesCount / 2);
        double mouses = (lostGamesCount / 3);
        double keyboards = (lostGamesCount / 3 / 2);
        double displays = Math.floor(keyboards / 2);

        double expenses = headsets * headsetPrice + mouses * mousePrice + keyboards * keyboardPrice + displays * displayPrice;

        System.out.println("Rage expenses: "+String.format("%.2f",expenses)+" lv.");
    }
}
