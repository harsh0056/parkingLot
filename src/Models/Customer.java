package Models;

import java.util.Date;

public class Customer extends Person {

    VehicleType vehicleType;

    Date entryTime;
    Date exitTime;


    public Customer(String name, VehicleType vehicleType, Date entryTime) {
        super(name);
        this.vehicleType = vehicleType;
        this.entryTime = entryTime;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }


    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }
}
