package parkingLot.levels;

import parkingLot.consts.Consts;

public class Level1 extends Level{

    public Level1() {
        super(Consts.LEVEL_1);
    }

//    public Map<Integer, String> createSmallSpots() {
//        return super.createSmallSpots(Consts.LEVEL_1);
//    }
//
//    public Map<Integer, String> createCompactSpots() {
//        return super.createCompactSpots(Consts.LEVEL_1);
//    }
//
//    public Map<Integer, String> createLargeSpots() {
//        return super.createLargeSpots(Consts.LEVEL_1);
//    }

    public void printListOfAvailableSpots(String vehicleType) {
        super.printListOfAvailableSpots(Consts.LEVEL_1, vehicleType);
    }
}
