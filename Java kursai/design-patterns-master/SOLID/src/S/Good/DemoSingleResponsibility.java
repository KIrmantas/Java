package S.Good;

public class DemoSingleResponsibility {
    public static void run() {
        CustomFile file = new CustomFile();
        file.Read("avc.txt");
        file.Write("Hello world");
    }
}
