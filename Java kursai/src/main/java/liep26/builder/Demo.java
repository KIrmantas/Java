package liep26.builder;

public class Demo {
    public static void main(String[] args) {
        Gift gift = new GiftBuilder("100$")
                .AddPackage("White box")
                .AddRibbon("Red ribbon")
                .Build();
        System.out.println(gift.getContents());
    }
}