package Models.payments;

public class PayThroughCreditCard implements  Payment {
    @Override
    public boolean payTicket(int amount) {
        System.out.println("Ticket amount "+amount+" payed through Credit Card Mode");
        return true;
    }
}
