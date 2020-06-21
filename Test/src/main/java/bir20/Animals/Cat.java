package bir20.Animals;

public class Cat extends Animal{
    public boolean tail; // ar turi uodega

    public Cat(String name, int age, String voice, boolean tail) {
        super(name, age, voice);
        this.tail = tail;
    }

    public boolean isTail() {
        return tail;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", tail=" + tail;
    }

    @Override
    public String yieldVoice() {
        return "Miau";
    }

}
