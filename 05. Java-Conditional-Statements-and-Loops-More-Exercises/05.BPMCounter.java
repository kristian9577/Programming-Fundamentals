import java.text.DecimalFormat;
import java.util.Scanner;

public class BPMCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double beatsPerMinutes=Double.parseDouble(scan.nextLine());
        int beatsCount=Integer.parseInt(scan.nextLine());
        double bars=beatsCount/4.0;
        int durationInSecond=(int)((beatsCount/beatsPerMinutes)*60);
        int durationMinutes=durationInSecond/60;
        durationInSecond%=60;
        DecimalFormat df=new DecimalFormat("0.#");
        System.out.printf("%s bars - %dm %ds",df.format(bars),durationMinutes,durationInSecond);
    }
}
