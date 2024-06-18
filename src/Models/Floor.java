package Models;

import java.util.HashMap;

public class Floor implements FloorPrototype<Floor> {

    private int floorNumber;
    private   HashMap<Integer, Boolean> parkingSlots;
     boolean isFloorFull(){
        for(int i=1;i<=10;i++){
            if(!parkingSlots.get(i)){
                return false;
            }
        }
        return true;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    @Override
    public String toString() {
        return "Floor{" +
                "floorNumber=" + floorNumber +
                ", parkingSlots=" + parkingSlots +
                '}';
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public HashMap<Integer, Boolean> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(HashMap<Integer, Boolean> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public Floor(){
        parkingSlots = new HashMap<>();
        for(int i=1;i<=10;i++){
            parkingSlots.put(i, false);
        }
    }
    public Floor(int floorNumber){
        this.floorNumber = floorNumber;
        parkingSlots = new HashMap<>();
        for(int i=1;i<=10;i++){
            parkingSlots.put(i, false);
        }
    }

    public Floor(Floor floor){
        this.floorNumber = floor.floorNumber;
        this.parkingSlots = floor.parkingSlots;

    }



    @Override
    public Floor clone() {
        return new Floor(this);
    }
}
