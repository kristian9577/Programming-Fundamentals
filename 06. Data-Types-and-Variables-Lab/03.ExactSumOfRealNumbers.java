import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number=Integer.parseInt(scan.nextLine());
        BigDecimal sum=new BigDecimal(0);
        for (int i = 0; i <number ; i++) {
            sum=sum.add(new BigDecimal(scan.nextLine()));
        }
        System.out.println(sum);
    }
}
