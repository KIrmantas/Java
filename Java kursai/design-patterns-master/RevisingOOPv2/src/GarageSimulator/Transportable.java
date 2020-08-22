package GarageSimulator;

public abstract class Transportable {
    private final long id;
    private Point location;

    public Transportable(long id, Point location){
        this.id = id;
        this.location = location;
    }

    public void transport(Garage garage){
        setLocation(garage.getLocation());
    }

    public long getId(){
        return id;
    }

    public Point getLocation(){
        return location;
    }

    private void setLocation(Point location){
        location = location;
    }
}
