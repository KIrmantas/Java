package liep26.adapter;

public class Monitor {
    private ConnectorHdmi connection;

    public Monitor(ConnectorHdmi connection) {
        this.connection = connection;
    }

    public void Display() {
        System.out.println(connection.sendVideo());
    }
}
