package O.Bad.Readers;

// Problem: is it possible to start using FancyReader instead of Reader in CustomFile class?
public class FancyReader extends Reader{
    @Override
    public void Read(String filename) {
        System.out.println("I am just being fancy for no reason");
        super.Read(filename);
    }
}
