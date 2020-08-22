package D.Bad;

import D.Bad.Readers.Reader;
import D.Bad.Writers.Writer;

// This is bad, because we depend on implementations.
// Depending on implementations is bad, because:
// 1) we are forced to know about the underlying implementation details
// 2) we no longer think in concepts
// 3) it's significantly more difficult to inject different (other) implementations
// (especially when they don't have the same base class)
// 4) We do not have support for IoC!

// 5) No multi-inheritance support (though we can implement multiple interfaces)
// 6) We are forced to limit our design with leaving changeable pieces of code (because by default java has everything virtual, meaning which we can override things)
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
