import java.util.Scanner;

public class BlankReceipt {
    public static void main(String[] args) {
        printReceipt();
    }

    static void printReceipt() {
        printHeader();
        printBody();
        printFooter();
    }

    static void printHeader() {
        System.out.println("CASH RECEIPT");
        System.out.println("------------------------------");
    }

    static void printBody() {
        System.out.println("Charged to____________________");
        System.out.println("Received by___________________");
    }

    static void printFooter() {
        System.out.println("------------------------------");
        System.out.println("\u00A9" + " SoftUni");
    }
}
