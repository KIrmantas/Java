package I.Good;

// ReadOnly file no longer has writing capabilities.
// For perfection, Moveable and Reader could be inherited by IReadonlyFile interface.
public class ReadOnlyFile implements Moveable, Reader {
    @Override
    public void move(String path) {

    }

    @Override
    public void read(String path) {

    }
}
