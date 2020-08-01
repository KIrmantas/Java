package O.Good;

import O.Good.Readers.Reader;
import O.Good.Writers.Writer;

public class DemoSingleResponsibility {
    public static void run() {
        CustomFile file = new CustomFile(new Writer(), new Reader());
        file.Read("avc.txt");
        file.Write("Hello world");
    }
}
