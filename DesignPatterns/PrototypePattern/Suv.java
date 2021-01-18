package PrototypePattern;

/**
 *
 * @author Sadusha
 */
public class Suv extends Vehicle{
    private int numberOfSeats;

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Suv{" + "numberOfSeats=" + numberOfSeats + '}';
    }
    
    
}
