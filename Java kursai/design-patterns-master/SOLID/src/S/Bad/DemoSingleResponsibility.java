package S.Bad;

public class DemoSingleResponsibility {
    // Irrelavant.
    public static void run() {
        CustomFile file = new CustomFile();
        file.Read("avc.txt");
        file.Write("Hello world");
    }
}
