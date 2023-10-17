package parkingLot.vehicles;

import parkingLot.consts.Consts;

public class Motorcycle extends Vehicle {

    public Motorcycle(String vPlateNumber, String vColor) {
        super(Consts.MOTORCYCLE_VEHICLE_TYPE, vPlateNumber, vColor);
    }

    public void printVehicleInfo() {
        super.printVehicleInfo(Consts.MOTORCYCLE_VEHICLE_TYPE);
    }

    public void parkVehicle(int level, int spotId) {
        super.parkVehicle(level, spotId, Consts.MOTORCYCLE_VEHICLE_TYPE);
    }
}
