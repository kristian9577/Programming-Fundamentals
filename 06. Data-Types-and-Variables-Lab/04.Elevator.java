import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfPeople=Integer.parseInt(scan.nextLine());
        int capacity=Integer.parseInt(scan.nextLine());
        int courses=(int)Math.ceil((double)numberOfPeople/capacity);
        if(numberOfPeople<capacity){
            System.out.println(1);
        }
        else{
            System.out.println(courses);
        }
    }
}
