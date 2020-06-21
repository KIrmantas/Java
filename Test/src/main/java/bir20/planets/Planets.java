package bir20.planets;

import java.time.DayOfWeek;

/*
Create enum Planets.
        a) Override toString method. It should print relative size of a planet and it’s name.
        E.g. „Huge Jupiter”, „Small Pluto”.
        b) Create distanceFromEarth method.
        c) Verify both methods for multiple planets.
*/
public enum Planets {
    MERKURIJUS("Merkurijus", 3.5),
    VENERA("Venera", 2.1),
    ZEME("Zeme", 0),
    MARSAS("Maras", 1.2),
    JUPITERIS("Jupiteris", 4.5),
    SATURNAS("Saturnas", 6.2),
    URANATAS("Uranas", 7.9),
    NEPTUNAS("Neptunas", 9.8);

    private String name;
    private double distansFromZeme;

    Planets(String name, double distansFromZeme) {
        this.name = name;
        this.distansFromZeme =distansFromZeme;
    }


    @Override
    public String toString() {
        return (this.ordinal() + 1) + " planeta yra " + this.name
                + " atsumas nuo Zemes " + this.distansFromZeme;
    }
}

/*
public enum Planet {
    EARTH("Mid", "Earth", 0),
    VENUS("Big", "Venus", 100.21),
    MARS("Mid", "Mars", 1515.55),
    PLUTO("Tiny", "Pluto", 111111.22);
    private String size;
    private String name;
    private double distanceFromEarth;
    Planet(String size, String name, double distanceFromEarth) {
        this.size = size;
        this.name = name;
        this.distanceFromEarth = distanceFromEarth;
    }
    @Override
    public String toString() {
        return size + " " + name;
    }
    public double getDistanceFromEarth() {
        return distanceFromEarth;
    }
}*/
