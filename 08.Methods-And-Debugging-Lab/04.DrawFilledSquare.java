import java.util.Scanner;

public class DrawFilledSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        printBody(n);

    }

    static void printBody(int n) {
        printFirstLine(n);
        printMiddleLine(n);
        printFirstLine(n);
    }

    static void printFirstLine(int n) {
        System.out.println(repeatStr("-", 2 * n));

    }

    static void printMiddleLine(int n) {
        for (int row = 0; row < n - 2; row++) {
            System.out.print("-");
            for (int i = 1; i < n; i++) {
                System.out.print("\\/");
            }
            System.out.println("-");
        }
    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
