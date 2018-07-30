import java.util.Scanner;

public class EmployeeData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        int age = scan.nextByte();
        char gender = scan.next().charAt(0);
        long idNumber = scan.nextLong();
        int empNumber = scan.nextInt();
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Personal ID: " + idNumber);
        System.out.println("Unique Employee number: " + empNumber);
    }
}
