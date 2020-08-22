package liep26.tv;

public class Tv {

    private boolean isOn;
    private int currentChannel;

    public boolean isOn() {
        return isOn;
    }

    public int getCurentChannel() {
        return currentChannel;
    }

    public int getVolume() {
        return volume;
    }

    private int volume;

    public void setOn(boolean isOn) {
        this.isOn = isOn;
        System.out.println("TV is on: " + isOn);

    }

    public void setCurentChannel(int curentChannel) {
        this.currentChannel = curentChannel;
        System.out.println("curent channel: " + curentChannel);
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume: " + volume);
    }

    public Tv() {
    }

}
