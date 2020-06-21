package bir20.muzzle;

public class Dog {
    private final Muzzle muzzle;
    private final String name;

    public Dog(String name, Muzzle muzzle) {
        this.muzzle = muzzle;
        this.name = name;
    }

    public Muzzle getMuzzle() {
        return muzzle;
    }

    public String getName() {
        return name;
    }
}
