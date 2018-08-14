
import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        int jump = Integer.parseInt(scan.nextLine());

        char Search = 'p';
        boolean hasMatch = false;

        for (int i = 0; i < text.length(); i++) {
            if (text.contains(Character.toString(Search))) {
                hasMatch = true;

                int endIndex = jump + 1;

                if (endIndex + i > text.length()) {
                    endIndex = text.length() - i;
                }

                String matchedString = text.substring(i,endIndex);
                System.out.println(matchedString);
                i += jump;
            }
        }

        if (!hasMatch) {
            System.out.println("no");
        }
    }
}