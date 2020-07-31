package liepa26.builder;

public class GiftBuilder {
    private final Gift gift;

    public GiftBuilder(String item) {
        gift = new Gift(item);
    }

    public GiftBuilder AddRibbon(String ribbon) {
        String oldContents = gift.getContents();
        gift.setContents(oldContents + "; Ribbon: " + ribbon);
        return this;
    }

    public GiftBuilder AddPackage(String pckage) {
        String oldContents = gift.getContents();
        gift.setContents(oldContents + "; package: " + pckage);
        return this;
    }

    public Gift Build() {
        return gift;
    }
}