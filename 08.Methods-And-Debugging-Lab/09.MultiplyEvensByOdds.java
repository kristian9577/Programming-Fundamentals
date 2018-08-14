import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        System.out.println(GetMultiplicationsEvenByOdds(number));

    }

    static int GetMultiplicationsEvenByOdds(int number) {
        number = Math.abs(number);
        int evenDigitSum = GetSumOfEvenOrOddDigit(number, true);
        int oddDigitSum = GetSumOfEvenOrOddDigit(number, false);

        return evenDigitSum * oddDigitSum;
    }

    static int GetSumOfEvenOrOddDigit(int number, boolean SumEven) {

        int remainder = SumEven ? 0 : 1;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == remainder) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;

    }
}
