import java.util.Scanner;

public class CharactersStats {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int currentHealth=Integer.parseInt(scan.nextLine());
        int maxHealth=Integer.parseInt(scan.nextLine());
        int currentEnergy=Integer.parseInt(scan.nextLine());
        int maxEnergy=Integer.parseInt(scan.nextLine());

        System.out.printf("Name: %s\n",name);
        System.out.printf("Health: |"+repeatStr("|",currentHealth)
                +repeatStr(".",maxHealth-currentHealth)+"|\n");
        System.out.printf("Energy: |"+repeatStr("|",currentEnergy)
                +repeatStr(".",maxEnergy-currentEnergy)+"|");

    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
