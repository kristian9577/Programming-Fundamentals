import java.util.Scanner;

public class StringsAndObjects {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String hello = "Hello";
        String world = "World";
        Object helloWord = hello + " " + world;
        String third = helloWord.toString();
        System.out.println(third);
    }
}
