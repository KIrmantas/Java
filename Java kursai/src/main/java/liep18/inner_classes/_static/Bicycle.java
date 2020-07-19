package liep18.inner_classes._static;

public class Bicycle {

    private int maxSpeed = 40;
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public class Wheel {
        public void damage() {
// we can refer to outer class's field
// (Wheel type object will be created
            maxSpeed *= 0.5;
        }
    }
}