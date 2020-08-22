package S.Bad;

import S.Bad.Readers.Reader;
import S.Bad.Writers.Writer;

// How many reasons does this class have to change?
// If reading changes, the class will change too
// if writing changes, the class will change too
// So a class has 2 reasons to change.
// Single Responsibility Principle states that it should have only 1!
public class CustomFile {
    public void Read(String filename) {
        System.out.println("Reading file: " + filename);
    }

    public void Write(String contents) {
        System.out.println("Writing contents: " + contents);
    }
}
