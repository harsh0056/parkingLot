package Models;

import java.util.Date;

public class Ticket {
    private static int TicketNumber;
    private String ticketIssuedFor;
    private VehicleType vehicleType;
    private Date issuedAt;
    private boolean isPaid;
    private String entryThroughGateNumber;

    public static void setTicketNumber(int ticketNumber) {
        TicketNumber = ticketNumber;
    }

    public Ticket(String ticketIssuedFor,VehicleType vehicleType, Date issuedAt, boolean isPaid) {
        this.ticketIssuedFor = ticketIssuedFor;
        this.vehicleType = vehicleType;
        this.issuedAt = issuedAt;
        this.isPaid = isPaid;
    }

    public Ticket(Customer customer )
    {
        this.ticketIssuedFor = customer.getName();
        this.vehicleType = customer.getVehicleType();
        this.issuedAt = customer.getEntryTime();
        this.isPaid = false;
    }

    public String getTicketIssuedFor() {
        return ticketIssuedFor;
    }

    public void setTicketIssuedFor(String ticketIssuedFor) {
        this.ticketIssuedFor = ticketIssuedFor;
    }

    public Date getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(Date issuedAt) {
        this.issuedAt = issuedAt;
    }



    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public String getEntryThroughGateNumber() {
        return entryThroughGateNumber;
    }

    public void setEntryThroughGateNumber(String entryThroughGateNumber) {
        this.entryThroughGateNumber = entryThroughGateNumber;
    }

    public Ticket(){
        TicketNumber++;
        issuedAt = new Date();
        isPaid = false;


    }

    public static int getTicketNumber() {
        return TicketNumber;
    }

    public int getParkingCost(Date endTime){
        double diff = endTime.getTime() - issuedAt.getTime();
        double diffHours = diff / (60 * 60 * 1000);
        int cost = 10;
        diffHours -= 1;
        double hours = (double) diffHours;

        while(hours>0){
            cost +=5;
            hours --;
        }


        return cost;
    }


}
