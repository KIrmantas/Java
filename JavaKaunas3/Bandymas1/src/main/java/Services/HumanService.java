package Services;

import classes.Gender;
import classes.Human;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HumanService {
    public HumanService() {
    }

    public String transformMessage(String message, Transformer transformer) {
        return transformer.transform(message);
    }

    public String transformMessage2(String message, Function<String, String> transformer) {
        return (String)transformer.apply(message);
    }

    public String transformHuman(Human human, Function<Human, String> transformer) {
        return "";
    }

    public String transformHuman2(Human human1, Human human2, BiFunction<Human, Human, String> tr) {
        return (String)tr.apply(human1, human2);
    }

    public List<Human> getHumans() {
        List<Human> humans = new ArrayList();
        humans.add(new Human("Jonas", 25, Gender.MALE));
        humans.add(new Human("Petras", 18, Gender.MALE));
        humans.add(new Human("ASta", 15, Gender.FEMALE));
        return humans;
    }

    public List<Human> filterByGender(Gender gender, List<Human> humans) {
        List<Human> rez = new ArrayList();
        Iterator var4 = humans.iterator();

        while(var4.hasNext()) {
            Human human = (Human)var4.next();
            if (human.getGender() == gender) {
                rez.add(human);
            }
        }

        return rez;
    }

    public Human getTheOldest(List<Human> humans) {
        Human oldestHuman = (Human)humans.get(0);
        Iterator var3 = humans.iterator();

        while(var3.hasNext()) {
            Human human = (Human)var3.next();
            if (human.getAge() > oldestHuman.getAge()) {
                oldestHuman = human;
            }
        }

        return oldestHuman;
    }

    public Human getTheYoungestMen(List<Human> humans) {
        Human yougestMen = (Human)humans.get(0);
        Iterator var3 = humans.iterator();

        while(var3.hasNext()) {
            Human human = (Human)var3.next();
            if (human.getGender() == Gender.MALE && human.getAge() < yougestMen.getAge()) {
                yougestMen = human;
            }
        }

        return yougestMen;
    }

    public Map<Gender, List<Human>> groupByGender(List<Human> humans) {
        Map<Gender, List<Human>> result = new HashMap();

        Human human;
        for(Iterator var3 = humans.iterator(); var3.hasNext(); ((List)result.get(human.getGender())).add(human)) {
            human = (Human)var3.next();
            if (!result.containsKey(human.getGender())) {
                result.put(human.getGender(), new ArrayList());
            }
        }

        return result;
    }

    public List<Human> filterByName(List<Human> humans, String name) {
        return (List)humans.stream().filter((h) -> {
            return !h.getName().equalsIgnoreCase(name);
        }).collect(Collectors.toList());
    }

    public List<String> getNamesByGender(List<Human> humans, Gender gender) {
        return null;
    }

    public Map<String, List<Human>> grupByName(List<Human> humans) {
        new HashMap();
        Map<Character, List<Human>> rezult1 = (Map)humans.stream().collect(Collectors.groupingBy((p) -> {
            return p.getName().charAt(0);
        }, Collectors.toList()));
        return (Map)humans.stream().collect(Collectors.groupingBy(Human::getName));
    }

    public void getAges(List<Human> person) {
        person.sort((a, b) -> {
            return a.getAge() - b.getAge();
        });
    }
}
