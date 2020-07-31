package garageSimulation;

public abstract class Transportable {

    private final long id;
    private Point location;

    public Transportable(long id, Point location) {
        this.id = id;
        this.location = location;
    }

    void transport(Garage garage) {
        setLocation(garage.getLocation());
    }

    long getId() {
        return id;
    }

    Point getLocation() {
        return location;
    }

    private void setLocation(Point location) {
        this.location = location;
    }

}
