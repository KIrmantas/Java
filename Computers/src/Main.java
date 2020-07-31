import manufacture.Computer;
import manufacture.ComputerBuilder;
import manufacture.Manufacturers;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new ComputerBuilder();

        Factory windowsFactory = new Factory();
        Computer computer = windowsFactory.constructComputer(computerBuilder, Manufacturers.MICROSOFT);
        System.out.println(computer);

        Factory macFactory = new Factory();
        computer = macFactory.constructComputer(computerBuilder, Manufacturers.MAC);
        System.out.println(computer);
    }
}
