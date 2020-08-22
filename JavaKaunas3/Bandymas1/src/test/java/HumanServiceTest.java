import Services.HumanService;
import classes.Gender;
import classes.Human;
import classes.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HumanServiceTest {
    private HumanService humanService;
    @BeforeEach
    void setUp() {
        humanService = new HumanService();
    }
    @Test
    void getHumans() {
        List<Human> result = humanService.getHumans();
        assertFalse(result.isEmpty());
    }
    @Test
    void filterByGender() {
        List<Human> humans = new ArrayList<>();
        humans.add(new Person(28, Gender.FEMALE, "Margarita", "Kazlauskyte"));
        humans.add(new Person(14, Gender.MALE, "Gediminas", "Petronis"));
        humans.add(new Person(37, Gender.MALE, "Konstantinas", "Eimutis"));
        humans.add(new Person(18, Gender.FEMALE, "Greta", "Petrauskaite"));
        List<Human> result = humanService.filterByGender(Gender.MALE, humans);
        assertFalse(result.isEmpty());
        assertEquals(2, result.size());
        assertEquals(Gender.MALE, result.get(0).getGender());
        assertEquals(Gender.MALE, result.get(1).getGender());
    }
    @Test
    void getTheOldest() {
        List<Human> humans = new ArrayList<>();
        humans.add(new Person(28, Gender.FEMALE, "Margarita", "Kazlauskyte"));
        humans.add(new Person(14, Gender.MALE, "Gediminas", "Petronis"));
        humans.add(new Person(37, Gender.MALE, "Konstantinas", "Eimutis"));
        humans.add(new Person(18, Gender.FEMALE, "Greta", "Petrauskaite"));
        Human result = humanService.getTheOldest(humans);
        assertNotNull(result);
        assertEquals(Gender.MALE, result.getGender());
        assertEquals(37, result.getAge());
    }
    @Test
    void groupByGender() {
        List<Human> humans = new ArrayList<>();
        humans.add(new Person(28, Gender.FEMALE, "Margarita", "Kazlauskyte"));
        humans.add(new Person(14, Gender.MALE, "Gediminas", "Petronis"));
        humans.add(new Person(37, Gender.MALE, "Konstantinas", "Eimutis"));
        humans.add(new Person(18, Gender.FEMALE, "Greta", "Petrauskaite"));
        Map<Gender, List<Human>> result = humanService.groupByGender(humans);
        assertNotNull(result);
        assertEquals(2, result.entrySet().size());
        assertEquals(2, result.get(Gender.MALE).size());
        assertEquals(2, result.get(Gender.FEMALE).size());
    }
}