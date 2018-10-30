import java.io.BufferedReader;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Enigma {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        List<String> atackedPlanets = new ArrayList<>();

        List<String> destroyedPlanets = new ArrayList<>();

        Pattern patternForStar = Pattern.compile("[STARstar]");

        Pattern patternValidMessage = Pattern
                .compile("@([A-z]+)[^@,!:>]*(:[\\d]+)[^@,!:>]*!([A||D])![^@,!:>]*(->[\\d]+)");

        for (int i = 0; i < n; i++) {

            String codetMessage = reader.readLine();

            Matcher matcherForStar = patternForStar.matcher(codetMessage);
            int countStar = 0;
            while (matcherForStar.find())
                countStar++;

            String decodetMessage = "";

            for (char c : codetMessage.toCharArray()) {
                decodetMessage = decodetMessage + (char)(c-countStar);
            }

            Matcher matcherMessage = patternValidMessage.matcher(decodetMessage);

            if(matcherMessage.find()){
                if("A".equals(matcherMessage.group(3)))
                    atackedPlanets.add(matcherMessage.group(1));
                else
                    destroyedPlanets.add(matcherMessage.group(1));
            }
        }

        Collections.sort(atackedPlanets);
        Collections.sort(destroyedPlanets);

        System.out.printf("Attacked planets: %d\n",atackedPlanets.size());
        for (String atackedPlanet : atackedPlanets) {
            System.out.printf("-> %s\n",atackedPlanet);
        }

        System.out.printf("Destroyed planets: %d\n",destroyedPlanets.size());
        for (String destroyedPlanet : destroyedPlanets) {
            System.out.printf("-> %s\n",destroyedPlanet);
        }







    }
}