import java.util.Scanner;

public class MemoryView {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder text = new StringBuilder();

        while (!input.equals("Visual Studio crash"))
        {
            text.append(input+" ");
            input = scanner.nextLine();
        }

        String[] words = text.toString().split(" ");
        for (int i = 0; i < words.length; i++)
        {
            if (words[i].equals("32656") && words[i + 1].equals("19759") && words[i + 2].equals("32763"))
            {
                Integer length = Integer.parseInt(words[i + 4]);
                StringBuilder word = new StringBuilder();
                for (int j = 0; j < length; j++)
                {
                    word.append((char)Integer.parseInt(words[i+6+j]));
                }
                System.out.println(word.toString());
                word.setLength(0);
            }
        }
    }
}