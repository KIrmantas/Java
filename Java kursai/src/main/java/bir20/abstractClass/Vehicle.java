package bir20.abstractClass;

public abstract class Vehicle {
    private int maxSpeed;

    public Vehicle(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public  abstract void move();
}

/*public abstract class Vehicle {
    private int maxSpeed;
    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void basic() {
        System.out.println("basic running");
        move();
    }
    public abstract void move();
}*/
