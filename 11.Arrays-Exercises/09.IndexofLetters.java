
import java.util.Scanner;

public class IndexofLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();


        char[] arr = new char[26];

        char[] arrFinal = word.toCharArray();

        int index = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            arr[index++] = i;
        }

        for (char letter : arrFinal) {
            int foundIndex = InddefOf(arr, letter);
            System.out.println(letter + " -> " + foundIndex);
        }
    }

    private static int InddefOf(char[] arr, char letter) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == letter) {
                return i;
            }
        }
        return -1;
    }
}
