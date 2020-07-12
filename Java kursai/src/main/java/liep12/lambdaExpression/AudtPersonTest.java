package liep12.lambdaExpression;

import java.util.function.Predicate;

public class AudtPersonTest implements Predicate<Person> {
    @Override
    public boolean test(Person person) {
        return person.getAge() >= 18;
    }
}
