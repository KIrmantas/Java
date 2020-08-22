package liep11.set;

import java.util.HashSet;
import java.util.Set;

// Set yra Map papildymas, kai reiksmes nera
public class Sets {
    public static void main(String[] args) {
        Set<String> travelRoute = new HashSet<>();
        travelRoute.add("Madrid");
        travelRoute.add("Berlin");
        travelRoute.add("Paris");
        travelRoute.add("Paris");
        travelRoute.add("Berlin");
        travelRoute.remove("Paris");
        for (String country : travelRoute) {
            System.out.println(country);
        }
    }
}
