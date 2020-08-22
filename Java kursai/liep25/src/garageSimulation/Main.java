package garageSimulation;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Transportable car = new Car(1,new Point(1, 1));
        Transportable bike = new Bike(2, new Point(2, 2));
        Transportable truck = new Truck(3, new Point(3, 3));

        Garage garage1 = new Garage(new Point(10,10));
        garage1.add(car);
        garage1.add(bike);

        Garage garage2 = new Garage(new Point(30, 30));
        garage2.add(truck);

        garage1.send(1, garage2);
        List<Transportable> transportables1 = garage1.getTransportables();

        String garage1TransportablesInfo = transportables1.toString();
        System.out.println(garage1TransportablesInfo);
    }
}
