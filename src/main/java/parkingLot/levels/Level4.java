package parkingLot.levels;

import parkingLot.consts.Consts;

import java.util.Map;

public class Level4 extends Level{

    public Level4() {
        super(Consts.LEVEL_4);
    }

    public Map<Integer, String> createSmallSpots() {
        return super.createSmallSpots(Consts.LEVEL_4);
    }

    public Map<Integer, String> createCompactSpots() {
        return super.createCompactSpots(Consts.LEVEL_4);
    }

    public Map<Integer, String> createLargeSpots() {
        return super.createLargeSpots(Consts.LEVEL_4);
    }

    public void printListOfAvailableSpots(String vehicleType) {
        super.printListOfAvailableSpots(Consts.LEVEL_4, vehicleType);
    }
}
