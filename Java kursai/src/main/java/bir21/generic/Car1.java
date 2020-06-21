package bir21.generic;

public class Car1 implements Comparable<Car1> {
    private int maxSpeed;

    public Car1(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    @Override
    public int compareTo (Car1 o) {
        return this.maxSpeed - o.maxSpeed;
    }
}