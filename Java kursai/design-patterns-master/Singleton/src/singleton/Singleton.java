package singleton;

public class Singleton {

    public static void main(String[] args) {
        ApplicationSettings settings = ApplicationSettings.getInstance();
        System.out.println(settings.toString());
    }
}