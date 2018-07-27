import java.util.Scanner;

public class TestNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOne=Integer.parseInt(scan.nextLine());
        int numberTwo=Integer.parseInt(scan.nextLine());
        int sum=Integer.parseInt(scan.nextLine());
        int totalSum=0;
        int count=0;
        boolean check=false;

        for (int i = numberOne; i >= 1 ; i--) {
            for (int j = 1; j <=numberTwo ; j++) {
                count++;
                totalSum+=i*j*3;
                if(totalSum>=sum){
                    check=true;
                    System.out.printf("%d combinations\n",count);
                    System.out.printf("Sum: %d >= %d",totalSum,sum);
                    break;
                }
            }
            if(totalSum>=sum){
                break;
            }
        }
        if(check==false){
            System.out.printf("%d combinations\n",count);
            System.out.printf("Sum: %d",totalSum);
        }
    }
}
