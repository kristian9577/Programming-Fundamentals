import java.text.MessageFormat;
import java.util.Scanner;

public class DNASequences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dnaSum = Integer.parseInt(scan.nextLine());
        char[] dna = new char[] { 'O', 'A', 'C', 'G', 'T', 'X' };
        int counter = 0;
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= 4; j++)
            {
                for (int k = 1; k <= 4; k++)
                {
                    counter++;
                    if (i + j + k >= dnaSum)
                    {
                        System.out.print(MessageFormat.format("{0}{1}{2}{3}{0} ", dna[0], dna[i], dna[j], dna[k]));
                    }
                    else
                    {
                        System.out.print(MessageFormat.format("{0}{1}{2}{3}{0} ", dna[5], dna[i], dna[j], dna[k]));
                    }

                    if (counter % 4 == 0)
                    {
                        System.out.println();
                    }
                }
            }
        }
    }
}