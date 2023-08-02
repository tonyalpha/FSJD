package section13.wildcards_in_generics;

public class Vehicle {
    private int vehicleId;

    public Vehicle(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                '}';
    }
    void info() {
        System.out.println("Vehicle ID is " + getVehicleId());
    }
}
