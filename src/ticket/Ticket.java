package ticket;

/**
 * Created by mhan on 10/28/2016.
 */
public class Ticket {
    protected double price;
    protected int number;

    public Ticket(int number) {
        this(number, 50); //default price is 50
    }

    public Ticket(int number, double price) {
        this.number = number;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return "Number:" + number + ",Price:" + price;
    }
}
