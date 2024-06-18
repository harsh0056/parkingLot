package Models.payments;

public class PayThroughOffline implements Payment {



    @Override
    public boolean payTicket(int amount) {
        System.out.println("Ticket amount "+amount+" payed through Cash Mode");
        return true;
    }
}
