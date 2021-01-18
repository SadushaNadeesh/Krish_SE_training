package PrototypePattern;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sadusha
 */
public class VehicleTypeRegistry {
    private Map<VehicleType, Vehicle> vehicles = new HashMap<>();

    public VehicleTypeRegistry() {
        this.initialize();
    }
    
    public Vehicle getVehicle(VehicleType vehicleType){
        Vehicle vehicle=null;
        try {
            vehicle = (Vehicle) vehicles.get(vehicleType).clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        
        return vehicle;
        
    }

    private void initialize() {
        Suv suv = new Suv();
        suv.setBrand("BMW");
        suv.setNumberOfSeats(5);
        suv.setPrice(100000);
        
        Car car = new Car();
        car.setBrand("Toyota");
        car.setType("Hatchback");
        car.setPrice(65000);
        
        vehicles.put(VehicleType.CAR, car);
        vehicles.put(VehicleType.SUV, suv);
        
    }
    
    
    
}
