package garageSimulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Garage {

    private final List<Transportable> transportables;
    private final Point location;

    public Garage(final Point location) {
        this.location = location;
        this.transportables = new ArrayList<>();
    }

    public void send(final long transortableId, final Garage garage) {
        final Transportable transportabeleToSend =  remove(transortableId);
        garage.add(transportabeleToSend);
        transportabeleToSend.transport(garage);
    }

    public Point getLocation() {
        return location;
    }

    public  List<Transportable> getTransportables(){
        return Collections.unmodifiableList(transportables);
    }

    public void add(final Transportable transportable) {
        // reikalingas final, kad negaletu keisti kintamuju. pvz:
        //transportable = null;
        transportables.add(transportable);
    }

    public Transportable remove(final long tranportableId) {
        final Transportable transportableRemove = findTranportable(tranportableId);
        transportables.remove(transportableRemove);

        return transportableRemove;
    }


    private Transportable findTranportable(final long tranportableId) {
        Transportable transportableRemove = null;
        for (Transportable transportable : transportables) {
            if (transportable.getId() == tranportableId) {
                transportableRemove = transportable;
                break;
            }
        }
        return transportableRemove;
    }
}
