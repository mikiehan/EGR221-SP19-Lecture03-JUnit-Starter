package ticket;

/**
 * Created by mhan on 12/3/2016.
 */
public class AdvanceTicket extends Ticket{
    public AdvanceTicket(int number, int daysAdvanced) {
        this(number, 50, daysAdvanced);
    }

    public AdvanceTicket(int number, double price, int daysAdvanced){
        super(number, price);
        if (daysAdvanced > 10) {
            this.price *= 0.6;
        } else {
            this.price *= 0.8;
        }
    }

    @Override
    public String toString() {
        return "ticket.Ticket Type: Advanced," + super.toString();
    }
}
