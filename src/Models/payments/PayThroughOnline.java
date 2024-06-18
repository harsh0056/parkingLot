package Models.payments;

public class PayThroughOnline implements  Payment{
    @Override
    public boolean payTicket(int amount) {
        System.out.println("Ticket amount "+amount+" payed online Mode");
        return true;
    }
}
