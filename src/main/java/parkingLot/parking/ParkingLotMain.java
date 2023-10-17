package parkingLot.parking;

import parkingLot.levels.Level1;
import parkingLot.levels.Level2;
import parkingLot.levels.Level3;
import parkingLot.levels.Level4;
import parkingLot.vehicles.Bus;
import parkingLot.vehicles.Car;
import parkingLot.vehicles.Motorcycle;

public class ParkingLotMain {
    public static void main(String[] args) {
        Level1 level1 = new Level1();
        level1.printListOfAvailableSpots("motorcycle");

        Level2 level2 = new Level2();
        level2.printListOfAvailableSpots("car");

        Level3 level3 = new Level3();
        level3.printListOfAvailableSpots("bus");

        Level4 level4 = new Level4();
        level4.printListOfAvailableSpots("plane");

        Motorcycle moto1 = new Motorcycle("AS123", "red");
        moto1.printVehicleInfo();
        moto1.parkVehicle(1,8);

        Motorcycle moto2 = new Motorcycle("GR317", "yellow");
        moto2.printVehicleInfo();
        moto2.parkVehicle(2,33);

        Car car1 = new Car("ABC443", "blue");
        car1.printVehicleInfo();
        car1.setVehicleColor("pink");
        car1.printVehicleInfo();
        car1.parkVehicle(4,17);

        Bus bus1 = new Bus("QWER8954", "black");
        bus1.printVehicleInfo();
        bus1.parkVehicle(3, 30);
    }
}
