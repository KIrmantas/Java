package bir20.planets;

public class PlanetsMain {
    public static void main(String[] args) {
        Planets planeta = Planets.MERKURIJUS;
        System.out.println(planeta);

        for (Planets planet :
                Planets.values()) {
            System.out.println(planet);
        }

    }
}

/*    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.println(planet);
            System.out.println("Distance from earth: " + planet.getDistanceFromEarth());
        }
    }*/
