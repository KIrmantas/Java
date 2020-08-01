package S.Good;

import S.Good.Readers.Reader;
import S.Good.Writers.Writer;

// file has 0 reason to change.
// SRP solution is composition
// SRP applies to methods and modules too.
public class CustomFile {
    private final Writer writer;
    private final Reader reader;

    public CustomFile(){
        this.writer = new Writer();
        this.reader = new Reader();
    }

    public void Write(String contents){
        writer.Write(contents);
    }

    public void Read(String filename){
        reader.Read(filename);
    }
}
