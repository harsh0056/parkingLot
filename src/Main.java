import Models.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final FloorRegistryImpl floorRegistry = new FloorRegistryImpl();

    public static void fillRegistry(){



        Floor floor = new Floor();
        floor.setFloorNumber(1);

        floor.getParkingSlots().put(1, true);
        floor.getParkingSlots().put(2, true);
        floor.getParkingSlots().put(3, true);



        floorRegistry.setPrototype(1, floor);




    }


    public static void main(String[] args) {

        fillRegistry();

        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.setName("Parking Lot 1");
        parkingLot.setAddress("Sector 1, Noida");
        Floor floor1 = new Floor(1);
        Floor floor2 = new Floor(2);
        parkingLot.setFloors(Arrays.asList(floor1, floor2));

        Customer customer = new Customer("Harsh Swami", VehicleType.CAR, new Date());
        Customer customer2 = new Customer("Sanjay Swami", VehicleType.CAR, new Date());
        Customer customer1 = new Customer("triveni",VehicleType.TRUCK,new Date());
        parkingLot.assignSpot(customer);
        parkingLot.assignSpot(customer1);
        parkingLot.assignSpot(customer2);





    }
}