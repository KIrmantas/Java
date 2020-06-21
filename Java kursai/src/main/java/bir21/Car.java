package bir21;

public class Car {
    private int speed;
    public void increaseSpeed() throws CarCrashedException {
        speed += 70;
        if(speed > 200) {
            throw new CarCrashedException(this);
        } else {
            System.out.println("Car speed " + speed);
        }
    }
}

/*
public class Car {
    private int speed;
    public void increaseSpeed() throws CarCrashException {
        speed += 70;
        if (speed > 200) {
            throw new CarCrashException(this);
        }
        System.out.println("Speed has been increased to " + speed);
    }
}*/
