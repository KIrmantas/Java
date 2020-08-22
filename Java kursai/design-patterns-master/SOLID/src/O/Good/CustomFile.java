package O.Good;

import O.Good.Readers.Reader;
import O.Good.Writers.Writer;

// file has 0 reason to change.
// SRP solution is composition
// SRP applies to methods and modules too.
public class CustomFile {
    private final Writer writer;
    private final Reader reader;

    // Now the dependencies come from outside.
    // The changes come for outside
    // The class is open for extension
    // The class is closed for a change.
    public CustomFile(Writer writer, Reader reader){
        this.writer = writer;
        this.reader = reader;
    }

    public void Write(String contents){
        writer.Write(contents);
    }

    public void Read(String filename){
        reader.Read(filename);
    }
}
