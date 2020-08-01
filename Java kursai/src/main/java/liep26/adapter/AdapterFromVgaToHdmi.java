package liep26.adapter;

public class AdapterFromVgaToHdmi extends ConnectorHdmi{
    private final ConnectorVga vga;

    public AdapterFromVgaToHdmi(ConnectorVga vga) {
        this.vga = vga;
    }

    @Override
    public String sendVideo() {
        return "Converted signal: " + vga.sendVideo();
    }
}
