import java.util.Scanner;
import java.math.BigDecimal;


public class BeverageLabels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int volume = Integer.parseInt(scan.nextLine());
        double energy=Double.parseDouble(scan.nextLine());
        double sugar=Double.parseDouble(scan.nextLine());

        BigDecimal totalEnergy = new BigDecimal(String.valueOf(energy / 100.0 * volume));
        BigDecimal totalSugar = new BigDecimal(String.valueOf(sugar * volume / 100.0));

        System.out.printf(volume+"ml "+name+":\n");
        System.out.printf("%skcal, %sg sugars", customRound(totalEnergy), customRound(totalSugar));

    }
    static String customRound(BigDecimal number){
        String numberString = number.setScale(12,BigDecimal.ROUND_HALF_UP).toString();
        int index = 15 - numberString.indexOf('.');
        number = new BigDecimal(numberString).setScale(index,BigDecimal.ROUND_HALF_UP)
                .setScale(12, BigDecimal.ROUND_HALF_UP).stripTrailingZeros();
        double numDouble = Double.parseDouble(number.toString());
        boolean remainder = numDouble % 1 == 0;
        return remainder ? String.format("%.0f", numDouble) : number.toString();
    }
}
