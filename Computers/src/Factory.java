import manufacture.Builder;
import manufacture.Computer;
import manufacture.Manufacturers;

public class Factory {

    public Computer constructComputer(Builder builder, Manufacturers manufacturers) {
        switch (manufacturers) {
            case MICROSOFT -> builder.setBody("WinBody")
                    .setCpu("WinCpu")
                    .setGpu("WinGpu")
                    .setRam(16)
                    .setOs("Windows");
            case MAC -> builder.setBody("MacBody")
                        .setCpu("MacCpu")
                        .setGpu("MacGpu")
                        .setRam(8)
                        .setOs("iOs");
        }
       return builder.Build();
    }
}
