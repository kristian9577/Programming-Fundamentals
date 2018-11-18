import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Weather {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final String regex = "([A-Z]{2})([+]?[0-9]*\\.[0-9]{1,2})([A-Z]+[a-z]*|[a-z]+[A-Z]*)\\|";
        final Pattern pattern = Pattern.compile(regex);

        String string = reader.readLine();

        Matcher matcher = pattern.matcher(string);

        LinkedHashMap<String, HashMap<Float, String>> towns = new LinkedHashMap<>();
        LinkedHashMap<String, Float> cityAndTemp = new LinkedHashMap<>();

        while (!string.equals("end")) {
            if (matcher.find()) {

                float temp = Float.parseFloat(matcher.group(2));
                String city = matcher.group(1);
                String weather = matcher.group(3);
                towns.putIfAbsent(city, new HashMap<>());
                towns.get(city).putIfAbsent(temp, weather);
                cityAndTemp.putIfAbsent(city, temp);

                if (towns.containsKey(city)) {
                    towns.remove(city);
                    towns.put(city, new HashMap<>());
                    towns.get(city).put(temp, weather);
                    cityAndTemp.remove(city);
                    cityAndTemp.put(city, temp);
                }
            }
            string = reader.readLine();
            matcher = pattern.matcher(string);
        }

        towns.entrySet().stream().sorted((t1, t2) -> cityAndTemp.get(t1.getKey()).compareTo(cityAndTemp.get(t2.getKey())))
                .forEach(town -> {
                    System.out.print(town.getKey() + " => " + cityAndTemp.get(town.getKey()) + " => ");
                    town.getValue().entrySet().stream().forEach(w -> System.out.print(w.getValue()));
                    System.out.println();
                });
    }
}