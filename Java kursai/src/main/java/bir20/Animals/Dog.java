package bir20.Animals;

public class Dog extends Animal{

    int teeth; // dantu skaicius :)

    public int getTeeth() {
        return teeth;
    }

    public Dog(String name, int age, String voice, int teeth) {
        super(name, age, voice);
        this.teeth = teeth;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", teeth=" + teeth;
    }

    @Override
    public String yieldVoice() {
        return "Auu";
    }

}
