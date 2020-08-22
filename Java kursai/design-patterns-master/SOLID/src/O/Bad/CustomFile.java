package O.Bad;

import O.Bad.Readers.FancyReader;
import O.Bad.Readers.Reader;
import O.Bad.Writers.Writer;

// file has 0 reason to change.
// SRP solution is composition
// SRP applies to methods and modules too.
public class CustomFile {
    private final Writer writer;
    private final Reader reader;

    public CustomFile(){
        // Violation of Open-Closed principle.
        // Hardcoding dependencies- DO NOT TRY THIS AT HOME.
        // If the exact implementations changes, the class will be forced to change too.
        this.writer = new Writer();
        // We're forced to change the existing working class, if we want to include or apply another implementation of a component.
        // We will be forced to create a new class. But there is a better way.
        // Inject the dependencies instead!
        this.reader = new FancyReader();
    }

    public void Write(String contents){
        writer.Write(contents);
    }

    public void Read(String filename){
        reader.Read(filename);
    }
}
