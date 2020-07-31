package liepa26.adapter;

import java.nio.charset.StandardCharsets;
import java.util.Random;

public class ConnectorVga implements Vga{

    public String sendVideo() {
        Random rnd = new Random();
        int signalLength = rnd.nextInt(256);
        byte[] bytes = new byte[signalLength];

        rnd.nextBytes(bytes);

        return new String(bytes, StandardCharsets.US_ASCII);
//        return "Testas testuotas";
    }
}
