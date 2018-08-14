import java.util.Scanner;

public class EnglishNameOfLastDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long number = Long.parseLong(scan.nextLine());

        String lastDigitName = GetLastDigitName(Math.abs(number));

        System.out.println(lastDigitName);

    }

    static String GetLastDigitName(long number) {
        long digit = number % 10;
        String lastDigitName = "";
        switch ( (new Long(digit)).intValue()) {
            case 0:
                lastDigitName = "zero";
                break;
            case 1:
                lastDigitName = "one";
                break;
            case 2:
                lastDigitName = "two";
                break;
            case 3:
                lastDigitName = "three";
                break;
            case 4:
                lastDigitName = "four";
                break;
            case 5:
                lastDigitName = "five";
                break;
            case 6:
                lastDigitName = "six";
                break;
            case 7:
                lastDigitName = "seven";
                break;
            case 8:
                lastDigitName = "eight";
                break;
            case 9:
                lastDigitName = "nine";
                break;

        }
        return lastDigitName;
    }
}
