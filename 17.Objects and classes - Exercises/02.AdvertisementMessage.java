import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    private static final String[] Phrases = {"Excellent product.", "Such a great product.", "I always use that product."
            , "Best product of its category.", "Exceptional product.", "I can't live without this product."};
    private static final String[] Events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!"
            , "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
    private static final String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
    private static final String[] Cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
    private static Random rnd = new Random();

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numbers=scanner.nextInt();
        for (int i = 0; i <numbers ; i++) {
            StringBuilder message = new StringBuilder();
            message.append(generateString(Phrases)).append(" ").append(generateString(Events)).append(" ").append(generateString(authors)).append("-").append(generateString(Cities)).append(".");
            System.out.println(message.toString());
        }

    }
    private static String generateString(String[] availableStrings) {
        int randomIndex = rnd.nextInt(availableStrings.length);
        String randomString = availableStrings[randomIndex];
        return randomString;
    }
}
