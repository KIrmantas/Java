package bir20.Animals;

public class Animal {
    private final String name;
    private final int age;
    private final String voice;

    public Animal(String name, int age, String voice) {
        this.name = name;
        this.age = age;
        this.voice = voice;
    }

    public String getName() {
        return name;
    }

    public String yieldVoice() {
        return "test";
    }


    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", age=" + age +
                ", voice='" + voice + "'";
    }
}
