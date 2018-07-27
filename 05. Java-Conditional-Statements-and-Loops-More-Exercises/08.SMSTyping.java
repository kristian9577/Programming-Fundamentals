import java.util.Scanner;

public class SMSTyping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] smsTable = new String[][]
                {
                        new String[]{" "},
                        new String[]{ },
                        new String[]{"a", "b","c"},
                        new String[]{"d","e","f"},
                        new String[]{"g","h","i"},
                        new String[]{"j","k","l" },
                        new String[]{"m","n","o"},
                        new String[]{"p","q","r","s"},
                        new String[]{"t","u","v" },
                        new String[]{"w","x","y","z" }
                };

        int characterCount = Integer.parseInt(scan.nextLine());
        String outputSms = "";
        for (int i = 0; i < characterCount; i++)
        {
            int charCode = Integer.parseInt(scan.nextLine());
            outputSms += smsTable[charCode % 10][String.valueOf(charCode).length() - 1];
        }
        System.out.println(outputSms);
    }
}