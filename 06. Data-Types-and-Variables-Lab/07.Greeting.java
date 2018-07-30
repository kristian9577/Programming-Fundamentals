import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();
        String secondName = scan.nextLine();
        int years = Integer.parseInt(scan.nextLine());
        System.out.printf("Hello, " + firstName + " " + secondName + ". You are " + years + " years old.");
    }
}
