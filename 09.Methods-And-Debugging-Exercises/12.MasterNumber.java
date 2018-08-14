import java.util.Scanner;

public class MasterNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= number; i++) {
            boolean isPalindrome = IsPalindromee(i);
            boolean isDivisibleBySeven = isDivisible(i);
            boolean hasEvenDigit = HasEvenDigit(i);

            boolean isMaster = isPalindrome && isDivisibleBySeven && hasEvenDigit;
            if (isMaster) {
                System.out.println(i);
            }
        }
    }

    static boolean HasEvenDigit(int number) {
        boolean hasEvenDigit = false;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                hasEvenDigit = true;
                break;
            }
            number /= 10;
        }
        return hasEvenDigit;
    }

    static boolean isDivisible(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        boolean isDivisible = sum % 7 == 0;
        return isDivisible;
    }

/*    static boolean IsPalindorme(int number) {
        String reversed = "";
        String numberAsString=Integer.toString(number);

        for (int i = numberAsString.length()-1; i >=0; i--) {
            reversed += numberAsString[i];
        }

        boolean isPalindrome = numberAsString == reversed;
        return isPalindrome;
    }*/
    public static boolean IsPalindromee(int number)
    {
        int n = number;
        int rev = 0;
        while (number > 0)
        {
            int dig = number % 10;
            rev = rev * 10 + dig;
            number = number / 10;
        }

        if (n == rev)
        {
            return true;
        }

        return false;
    }
}