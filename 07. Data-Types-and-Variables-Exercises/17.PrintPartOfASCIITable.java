import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startChart=scan.nextInt();
        int lastChart=scan.nextInt();
        for (char i = (char)startChart; i <=(char)lastChart; i++) {
            System.out.print(i+" ");
        }
    }
}
