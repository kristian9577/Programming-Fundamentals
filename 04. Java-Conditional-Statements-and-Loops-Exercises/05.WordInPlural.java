import java.util.Scanner;

public class WordInPlural {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String noun = scan.nextLine();

        if (noun.charAt(noun.length() - 1) == 'y') {
            noun = noun.replace(noun.substring(noun.length() - 1), "ies");
            System.out.println(noun);
        }
        else if(noun.charAt(noun.length() - 1) == 'o') {
            noun=noun+"es";
            System.out.println(noun);
        }
        else if(noun.charAt(noun.length() - 1) == 's') {
            noun=noun+"es";
            System.out.println(noun);
        }
        else if(noun.charAt(noun.length() - 1) == 'z') {
            noun=noun+"es";
            System.out.println(noun);
        }
        else if(noun.charAt(noun.length() - 1) == 'x') {
            noun = noun + "es";
            System.out.println(noun);
        }
        else if(noun.endsWith("ch")) {
            noun=noun+"es";
            System.out.println(noun);
        }
        else if(noun.endsWith("sh")) {
            noun=noun+"es";
            System.out.println(noun);
        }
        else{
            noun=noun+"s";
            System.out.println(noun);
        }
    }
    }

