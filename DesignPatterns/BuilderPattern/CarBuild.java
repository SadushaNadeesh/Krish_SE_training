package BuilderPattern;

/**
 *
 * @author Sadusha
 */
public class CarBuild {
    public static void main(String[] args) {
        Car.CarBuilder carBuilder = new Car.CarBuilder("Full");
        Car car = carBuilder.availability(true).dropOff("Colombo").Build();
        System.out.println(car);
    }
    
}