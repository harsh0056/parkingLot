package Models;

import java.util.Date;
import java.util.List;

public class ParkingLot {

    private static ParkingLot parkingLotInstance = null;

    private ParkingLot(){

    }

    public static ParkingLot getInstance(){
        if(parkingLotInstance == null){
            synchronized (ParkingLot.class){
                if(parkingLotInstance == null){
                    parkingLotInstance = new ParkingLot();
                }
            }
        }
        return parkingLotInstance;
    }

    private String name;
    private String Address;

    private List<Floor> floors;

private List<EntryGate> entryGates;

private List<ExitGate> exitGates;

    public static ParkingLot getParkingLotInstance() {
        return parkingLotInstance;
    }

    public static void setParkingLotInstance(ParkingLot parkingLotInstance) {
        ParkingLot.parkingLotInstance = parkingLotInstance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public List<EntryGate> getEntryGates() {
        return entryGates;
    }

    public void setEntryGates(List<EntryGate> entryGates) {
        this.entryGates = entryGates;
    }

    public List<ExitGate> getExitGates() {
        return exitGates;
    }

    public void setExitGates(List<ExitGate> exitGates) {
        this.exitGates = exitGates;
    }


    public Floor findParkingSpot(Customer customer){
        Floor floorWithSpot= null;
        for(Floor floor:floors){
            if(!floor.isFloorFull()){
                for(int i=1;i<=10;i++){
                    if(!floor.getParkingSlots().get(i)){
                        floor.getParkingSlots().put(i, true);
                        return floor;

                    }
                }
            }
        }
        return null;
    }

    public boolean assignSpot(Customer customer){

        Floor floorWithSpot = findParkingSpot(customer);

        if(floorWithSpot!=null) {
            int spot = 0;
            for (int i = 1; i <= 10; i++) {
                if (floorWithSpot.getParkingSlots().get(i)) {

                    spot = i;
                    break;
                }
            }
            System.out.println("Parking Spot for customer "+customer.getName()+" found on floor: " + floorWithSpot.getFloorNumber()+ " at spot: "+ spot);
            return true;
        }
        else{
            System.out.println("Parking Full");

        }
        return false;
    }


}
