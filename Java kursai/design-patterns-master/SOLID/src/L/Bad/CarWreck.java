package L.Bad;

// CarWreck cannot move
// CarWreck is not a car
// CarWreck is a Wreck!
public class CarWreck extends Car{
    @Override
    public void move() {
        throw new RuntimeException("Broken car can't move! Oh no!");
    }
}
