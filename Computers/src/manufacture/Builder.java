package manufacture;

public interface Builder {
    ComputerBuilder setBody(String body);
    ComputerBuilder setGpu(String gpu);
    ComputerBuilder setCpu(String cpu);
    ComputerBuilder setRam(int ram);
    ComputerBuilder setOs(String os);
    Computer Build();
    }
