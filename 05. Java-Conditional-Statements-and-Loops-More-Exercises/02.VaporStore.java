
import java.util.Scanner;

public class VaporStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double moneyLeft = Double.parseDouble(scan.nextLine());
        double moneySpent = 0;

        while (moneyLeft > 0)
        {
            double gamePrice = 0;
            String gameBought = scan.nextLine();
            switch (gameBought)
            {
                case "CS: OG":
                    gamePrice = 15.99;
                    break;
                case "Zplinter Zell":
                    gamePrice = 19.99;
                    break;
                case "Honored 2":
                    gamePrice = 59.99;
                    break;
                case "RoverWatch":
                    gamePrice = 29.99;
                    break;
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    gamePrice = 39.99;
                    break;
                case "Game Time":
                    System.out.printf("Total spent: $%.2f. Remaining: $%.2f%n", moneySpent, moneyLeft);
                    return;
                default:
                    System.out.println("Not Found");
                    continue;
            }

            if (moneyLeft >= gamePrice)
            {
                System.out.printf("Bought %s%n", gameBought);
                moneyLeft -= gamePrice;
                moneySpent += gamePrice;
            }
            else
            {
                System.out.println("Too Expensive");
            }
        }

        System.out.println("Out of money!");
    }
}