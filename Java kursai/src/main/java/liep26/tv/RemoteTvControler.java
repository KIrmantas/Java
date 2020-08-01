package liep26.tv;

public class RemoteTvControler{

    private final Tv tv;
    private final Command setChannel1Command;

    public RemoteTvControler(Tv tv) {
        this.tv = tv;
        this.setChannel1Command = new SetChannel1Command(tv);
    }

    public void turnOnOff() {
        tv.setOn(true);
    }

    public void Channel1() {
        setChannel1Command.execute();
//        tv.setCurentChannel(1);
    }

    public void Channel2() {
        tv.setCurentChannel(2);
    }

    public void VolumeUp() {
        tv.setVolume(tv.getVolume() + 1);
    }

    public void VolumeDown() {
        tv.setVolume(tv.getVolume() - 1);
    }
}
