package liep11.input_output;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        File file = new File("test.txt");
        saveToFile(file);
        Person person = readFromFile(file);
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
    }
    private static Person readFromFile(File file) {
        Person person = null;
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            person = (Person) objectInputStream.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return person;
    }
    private static void saveToFile(File file) {
        Person person = new Person("John", "Brown");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
