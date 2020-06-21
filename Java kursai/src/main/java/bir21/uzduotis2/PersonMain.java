package bir21.uzduotis2;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("Jonas", 1.85);
        Person person2 = new Person("Petras", 1.95);

        int rez = person1.compareTo(person2);
        System.out.println(rez);
        if (rez == 0 ) {
            System.out.println("Ugiai vienodi");
        } else if (rez < 0) {
            System.out.println("Antras aukstesnis");
        } else {
            System.out.println("Pirmas aukstesnis");
        }
    }
}
