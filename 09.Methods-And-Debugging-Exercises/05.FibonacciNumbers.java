import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        if (number == 0) {
            System.out.println(1);
        } else {
            System.out.println(FiboMethod(number));
        }
    }

    static int FiboMethod(int number) {
        int a = 0;
        int b = 1;
        int answer = 0;

        for (int cycle = 0; cycle < number; cycle++) {
            answer = a + b;
            a = b;
            b = answer;
        }
        return answer;
    }
}
