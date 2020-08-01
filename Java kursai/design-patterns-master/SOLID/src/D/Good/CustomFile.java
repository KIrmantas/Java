package D.Good;

import D.Good.Readers.Reader;
import D.Good.Writers.Writer;

// This is good, because we no longer depends on implementations!
// This means, that we don't base swapping the dependencies through child subclasses (especially when some classes simply needs to be final!)
// So we are free to have a design exactly as we want
// Cons: extra interface (which really does not amount to much extra complexity)
public class CustomFile {

    private final Writer writer;
    private final Reader reader;

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
