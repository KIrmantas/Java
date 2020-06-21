package bir20.Animals;

import java.util.ArrayList;
import java.util.List;

public class AnimalMain {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Aras", 5, "Auu auu", 24));
        animals.add(new Cat("Ricka", 2, "Miau", true));
        animals.add(new Animal("Gyvunas", 7, "Muuu"));

        Animal anima = animals.get(0);
        System.out.println(anima.getName() + " " + ((Dog) animals.get(0)).getTeeth());
        anima = animals.get(1);
        System.out.println(anima.getName() + " " + ((Cat) animals.get(1)).isTail());


        for (Animal x :
                animals) {
            String str = x.getClass().getSimpleName() + "{" + x.toString() + "}";
            System.out.println(str);
            System.out.println(x.yieldVoice());
        }
    }
}
