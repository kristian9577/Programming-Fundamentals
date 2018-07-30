import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        for (int i = 1; i <=n ; i++) {
            int sum=0;
            int digits=i;
            while(digits>0){
                sum+=digits%10;
                digits=digits/10;
            }
            boolean special=(sum==5)||(sum==7)||(sum==11);
            String str = Boolean.toString(special);
            System.out.println(i+" -> "+str);
        }
    }
}
