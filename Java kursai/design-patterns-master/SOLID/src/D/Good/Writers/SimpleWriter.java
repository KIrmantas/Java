package D.Good.Writers;

// Class has a single reason to change- write change.
// Now we implement an abstraction- Writer
public class SimpleWriter implements Writer{
    public void Write(String contents){
        System.out.println("Writing contents: " + contents);
    }
}
