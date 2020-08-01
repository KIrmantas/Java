package liep26.tv;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv();
        RemoteTvControler controler = new RemoteTvControler(tv);
        controler.turnOnOff();
        controler.VolumeUp();
        controler.Channel1();
        controler.Channel2();
    }
}
