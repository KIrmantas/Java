package manufacture;

public class Computer{
    public String body;
    public String gpu;
    public String cpu;
    public int ram;
    public String os;

    public Computer() {
    }

    @Override
    public String toString() {
        return "Computer ={" +
                "body='" + body + '\'' +
                ", gpu='" + gpu + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", os='" + os + '\'' +
                '}';
    }

}
