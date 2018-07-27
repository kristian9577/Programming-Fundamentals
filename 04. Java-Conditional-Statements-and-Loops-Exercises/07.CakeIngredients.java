import java.util.Scanner;

public class CakeIngredients {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter=0;

        while (true){
            String ingredient=scan.nextLine();
            if(ingredient.equals("Bake!"))
            {
                break;
            }
            System.out.println("Adding ingredient "+ingredient+".");
            counter++;
        }

        System.out.printf("Preparing cake with %d ingredients.",counter);
    }
}
