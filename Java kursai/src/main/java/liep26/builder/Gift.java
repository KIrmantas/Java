package liep26.builder;

public class Gift {
    private String contents;

    public Gift(String item) {
        this.contents = item;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}