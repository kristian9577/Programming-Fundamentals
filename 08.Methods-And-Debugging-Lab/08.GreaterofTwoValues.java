import java.util.Scanner;

public class GreaterofTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type = scan.nextLine();

        if (type.equals("int")) {
            int first = Integer.parseInt(scan.nextLine());
            int second = Integer.parseInt(scan.nextLine());
            int max = GetMax(first, second);
            System.out.println(max);
        } else if (type.equals("char")) {
            char first = scan.nextLine().charAt(0);
            char second = scan.nextLine().charAt(0);
            char max = GetMax(first, second);
            System.out.println(max);
        } else if (type.equals("string")) {
            String first = scan.nextLine();
            String second = scan.nextLine();
            String max = GetMax(first, second);
            System.out.println(max);
        }

    }

    static int GetMax(int first, int second) {
        if (first >= second) {
            return first;
        } else {
            return second;
        }
    }

    static char GetMax(char first, char second) {
        if (first > second) {
            return first;
        } else if (first < second) {
            return second;
        } else {
            return first;
        }
    }

    static String GetMax(String first, String second) {
        if (first.compareTo(second) > 0) {
            return first;
        } else if (second.compareTo(first) > 0) {
            return second;
        } else {
            return first;
        }
    }
}
