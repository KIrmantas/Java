package D.Bad;

import D.Bad.Readers.Reader;
import D.Bad.Writers.Writer;

public class DemoSingleResponsibility {
    public static void run() {
        CustomFile file = new CustomFile(new Writer(), new Reader());
        file.Read("avc.txt");
        file.Write("Hello world");
    }
}
