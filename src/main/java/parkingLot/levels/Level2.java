package parkingLot.levels;

import parkingLot.consts.Consts;

import java.util.Map;

public class Level2 extends Level{

    public Level2() {
        super(Consts.LEVEL_2);
    }

    public Map<Integer, String> createSmallSpots() {
        return super.createSmallSpots(Consts.LEVEL_2);
    }

    public Map<Integer, String> createCompactSpots() {
        return super.createCompactSpots(Consts.LEVEL_2);
    }

    public Map<Integer, String> createLargeSpots() {
        return super.createLargeSpots(Consts.LEVEL_2);
    }

    public void printListOfAvailableSpots(String vehicleType) {
        super.printListOfAvailableSpots(Consts.LEVEL_2, vehicleType);
    }
}
