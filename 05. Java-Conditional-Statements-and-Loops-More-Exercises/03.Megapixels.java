import java.text.DecimalFormat;
import java.util.Scanner;

public class Megapixels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int widht=Integer.parseInt(scan.nextLine());
        int height=Integer.parseInt(scan.nextLine());
        double pixels=((widht*height)/1000000.0);
        DecimalFormat df = new DecimalFormat("0.#");
        System.out.printf("%dx%d => %sMP",widht,height,df.format(pixels));
    }
}
