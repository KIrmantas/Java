package GarageSimulator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Garage {
    private final List<Transportable> transportables;
    private final Point location;

    public Garage(final Point location) {
        this.transportables = new ArrayList<>();
        this.location = location;
    }

    public void send(final long transportableId, final Garage garage){
        final Transportable transportableToSend = remove(transportableId);
        garage.add(transportableToSend);
        transportableToSend.transport(garage);
    }

    public Point getLocation(){
        return location;
    }

    public List<Transportable> getTransportables(){
        return Collections.unmodifiableList(transportables);
    }

    public void add(final Transportable transportable){
        transportables.add(transportable);
    }

    public Transportable remove(final long transportableId){
        final Transportable transportableToRemove = findTransportable(transportableId);
        transportables.remove(transportableToRemove);

        return transportableToRemove;
    }

    private Transportable findTransportable(final long transportableId) {
        Transportable transportableToRemove = null;
        for (Transportable transportable : transportables) {
            if(transportable.getId() == transportableId){
                transportableToRemove = transportable;
                break;
            }
        }
        return transportableToRemove;
    }
}
