import bir13.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import static org.junit.Assert.*;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)

public class PersonalTest {

    Person person;

    @Parameters
    public static Integer[] trueParameters() {
        return new Integer[]{11, 12, 15, 18, 19};
    }
//    public static int[] parametraiTrue() {
//        return new int[] {11, 12, 13, 15, 18, 19};
//    }

    @Parameter
    public int year;

    @Test
    public void isTeenager_returnTrue() {
        person = new Person(year);
//        int rez = person.getYear();
        assertTrue(person.isTeenager());

    }

    @Test
    public void isTeenager_returnFalse() {
        person = new Person(11);
//        int rez = person.getYear();
        assertFalse(person.isTeenager());
    }

}
