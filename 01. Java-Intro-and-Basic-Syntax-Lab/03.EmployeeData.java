import java.util.Scanner;

public class EmployeeData {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name=scan.nextLine();
        int age=Integer.parseInt(scan.nextLine());
        int id=Integer.parseInt(scan.nextLine());
        double salary=Double.parseDouble(scan.nextLine());

        System.out.printf("Name: %s%n",name);
        System.out.printf("Age: %d%n",age);
        System.out.printf("Employee ID: %08d%n",id);
        System.out.printf("Salary: %.2f%n",salary);

    }
}
