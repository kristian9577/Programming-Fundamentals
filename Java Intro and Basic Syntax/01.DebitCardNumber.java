import java.util.Scanner;

public class DebitCardNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        int m=Integer.parseInt(scan.nextLine());
        int k=Integer.parseInt(scan.nextLine());
        int l=Integer.parseInt(scan.nextLine());

        System.out.printf("%04d %04d %04d %04d",n,m,k,l);
    }
}
