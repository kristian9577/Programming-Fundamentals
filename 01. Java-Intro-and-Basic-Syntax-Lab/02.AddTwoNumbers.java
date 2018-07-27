import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=Integer.parseInt(scan.nextLine());
        int b=Integer.parseInt(scan.nextLine());

        System.out.printf("%d + %d = %d",a,b,a+b);
    }
}
