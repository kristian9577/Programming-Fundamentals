import java.util.Scanner;

public class MagicLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char one=scan.nextLine().charAt(0);
        char two=scan.nextLine().charAt(0);
        char three=scan.nextLine().charAt(0);

        for (char i = one; i <=two ; i++) {
            for (char j = one; j <=two ; j++) {
                for (int k = one; k <=two ; k++) {
                    if (i !=three && j != three && k != three){
                        System.out.printf("%c%c%c ",i,j,k);
                    }
                }
            }
        }
    }
}
