import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        printHello(name);
    }

    private static void printHello(String name) {
        System.out.println("Hello, " + name+"!");
    }
}
