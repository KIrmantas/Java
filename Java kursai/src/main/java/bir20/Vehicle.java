package bir20;

public class Vehicle {
//    private int maxSpeed;
    protected int maxSpeed; // pasiekiamas tik kitoje klaseje

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // protected (vietoje public) - leis iskviesti tik paveldimose klasese
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "maxSpeed= " + maxSpeed +
                '}';
    }
}
