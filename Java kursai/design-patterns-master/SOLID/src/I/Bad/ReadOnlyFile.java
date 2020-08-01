package I.Bad;

// We should only be able to read and move a readonly file.
// We do not need to be forced to implement writing on a read-only file.
public class ReadOnlyFile implements File {
    @Override
    public void move(String path) {

    }

    @Override
    public void read(String path) {

    }

    @Override
    public void write(String contents) {
        // Unsupported, because readonly
    }
}
