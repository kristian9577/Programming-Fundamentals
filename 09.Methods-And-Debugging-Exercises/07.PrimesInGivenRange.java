import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimesInGivenRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long startNum = Long.parseLong(scan.nextLine());
        long endNum = Long.parseLong(scan.nextLine());

        List myList = new ArrayList();

        for (long i = startNum; i <= endNum; i++) {
            myList = FindPrimeInRange(i, myList);
        }
        String result = "";

        for (int i = 0, length = myList.size(); i < length; i++)
            result += (i == 0 ? "" : ", ") + myList.get(i);
        if (startNum > endNum) {

            System.out.println("(empty list)");
        } else {
            System.out.println(result);
        }
    }

    static List FindPrimeInRange(long number, List myList) {
        if (isPrime(number)) {
            myList.add(number);
        }
        return myList;
    }

    private static boolean isPrime(long number) {
        if ((number & 1) == 0) {
            if (number == 2) {
                return true;
            }
            return false;

        }
        for (long i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return number != 1;
    }
}
