package bir13;

public class Person {
    private int year;

    public Person(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isTeenager() {
        return (10 < year && year < 20);
    }
}
