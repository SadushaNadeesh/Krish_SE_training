package BuilderPattern;

/**
 *
 * @author Sadusha
 */
public class Car {

    private final String insurance;
    private final String dropOff;
    private final boolean availability;

    private Car(CarBuilder carBuilder) {
        this.insurance = carBuilder.insurance;
        this.dropOff = carBuilder.dropOff;
        this.availability = carBuilder.availability;
    }

    //Builder class.Static nested class.
    static class CarBuilder {

        private String insurance;
        private String dropOff;
        private boolean availability;
        
        public Car Build(){
            return new Car(this);
        }

        public CarBuilder(String insurance) {
            this.insurance = insurance;
        }
        
        public CarBuilder availability(boolean availability){
            this.availability = availability;
            return this;
        }
        public CarBuilder dropOff(String dropOff){
            this.dropOff = dropOff;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Car{" + "insurance=" + insurance + ", dropOff=" + dropOff + ", availability=" + availability + '}';
    }
}