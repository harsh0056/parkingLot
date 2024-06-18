package Models.payments;

public class PaymentFactory {

    public static void payForTicket(PaymentMode paymentMode,int amount){
        switch(paymentMode){
            case ONLINE:
                new PayThroughOnline().payTicket(amount);
                break;
            case OFFLINE:
                new PayThroughOffline().payTicket(amount);
                break;
                case CARD:
                new PayThroughCreditCard().payTicket(amount);
                break;
            default: new PayThroughOffline().payTicket(amount);
        }
    }

}
