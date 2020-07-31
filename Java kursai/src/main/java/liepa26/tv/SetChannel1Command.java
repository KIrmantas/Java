package liepa26.tv;

public class SetChannel1Command implements Command{

    private final Tv tv;

    public SetChannel1Command(Tv tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.setCurentChannel(1);
    }
}
