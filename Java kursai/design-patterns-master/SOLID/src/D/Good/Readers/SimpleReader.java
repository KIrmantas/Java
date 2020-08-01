package D.Good.Readers;

// Now we implement an abstraction- Reader
public class SimpleReader implements Reader{
    public void Read(String filename){
        System.out.println("Reading file: " + filename);
    }
}
