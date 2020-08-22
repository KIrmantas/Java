package liep11.map;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();
        countries.put("Poland", "Warsaw");
        countries.put("Poland", "Belistok");  // sena topacio rakto reiksme pakeicia nauja
        countries.put("Germany", "Berlin");

        // Map.Emtry() - paima visus irasus
        for(Map.Entry<String, String> dictionary: countries.entrySet()) {
            String country = dictionary.getKey();
            String capital = dictionary.getValue();
            System.out.printf("%s : %s\n", country, capital);
        }
    }
}
