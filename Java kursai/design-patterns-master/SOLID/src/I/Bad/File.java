package I.Bad;
// Fat interface is bad!
// Don't force people to implement things that they don't care about!
// In this case we force to implement all 3 methods!!!
public interface File {
    void move(String path);
    void read(String path);
    void write(String contents);
}
