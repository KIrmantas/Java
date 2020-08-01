package liep26.adapter;

public class Test {
    public static void main(String[] args) {

        ConnectorVga vgaSignal = new ConnectorVga();
        ConnectorHdmi connectorHdmi = new AdapterFromVgaToHdmi(vgaSignal);
        Monitor monitor = new Monitor(connectorHdmi);
        monitor.Display();
    }
}
