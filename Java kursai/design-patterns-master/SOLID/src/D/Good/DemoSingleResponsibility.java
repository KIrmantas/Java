package D.Good;

import D.Good.Readers.SimpleReader;
import D.Good.Writers.SimpleWriter;

public class DemoSingleResponsibility {
    public static void run() {
        CustomFile file = new CustomFile(new SimpleWriter(), new SimpleReader());
        file.Read("avc.txt");
        file.Write("Hello world");
    }
}
