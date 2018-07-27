import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try{
            int n=Integer.parseInt(scan.nextLine());
            System.out.println("It is a number.");
        }
        catch (Exception ex){
            System.out.println("Invalid input!");
        }
    }
}
