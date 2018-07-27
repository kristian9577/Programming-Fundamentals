import java.util.Scanner;

public class DifferentNumbers5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        boolean check = false;
        for (int i = a; i <= b; i++) {
            for (int j = a; j <= b; j++) {
                for (int k = a; k <= b; k++) {
                    for (int l = a; l <= b; l++) {
                        for (int m = a; m <= b; m++) {
                            {
                                if (a <= i && i < j && j < k && k < l && l < m && m <= b) {
                                    System.out.printf("%d %d %d %d %d\n", i, j, k, l, m);
                                    check = true;
                                }
                            }
                        }
                    }
                }

            }
        }
        if (check == false) {
            System.out.println("No");
        }
    }
}
