package bir21.generic;

public class Garage<T extends Vehicle> {
    private T vehicle;

    public Garage(T vehicle) {
        this.vehicle = vehicle;
    }

    public void  repairVehicle() {
        vehicle.repair();
    }
}
