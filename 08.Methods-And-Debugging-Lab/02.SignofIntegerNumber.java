import java.util.Scanner;

public class SignofIntegerNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num=Integer.parseInt(scan.nextLine());
        getResult(num);

    }
    static  void getResult(int num){
        String result="";
        if(num>0){
            result="positive";
        }
        else if(num<0){
            result="negative";
        }
        else{
            result="zero";
        }
        System.out.printf("The number %d is %s.",num,result);
    }
}
