package manufacture;

public class ComputerBuilder implements Builder{
    private final Computer computer;

    public ComputerBuilder() {
        computer = new Computer();
    }

    public ComputerBuilder setBody(String body) {
        computer.body = body;
        return this;
    }

    public ComputerBuilder setGpu(String gpu) {
        computer.gpu = gpu;
        return this;
    }

    public ComputerBuilder setCpu(String cpu) {
        computer.cpu = cpu;
        return this;
    }

    public ComputerBuilder setRam(int ram) {
        computer.ram = ram;
        return this;
    }

    public ComputerBuilder setOs(String os) {
        computer.os = os;
        return this;
    }

    public Computer Build() {
        return computer;
    }

}
