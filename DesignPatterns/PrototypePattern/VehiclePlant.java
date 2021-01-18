package PrototypePattern;

/**
 *
 * @author Sadusha
 */
public class VehiclePlant {
    public static void main(String[] args) {
        VehicleTypeRegistry vehicleTypeRegistry = new VehicleTypeRegistry();
        Car car = (Car) vehicleTypeRegistry.getVehicle(VehicleType.CAR);
        System.out.println(car);
        
        car.setType("Saloon");
        System.out.println(car);
             
        Car car1 = (Car) vehicleTypeRegistry.getVehicle(VehicleType.CAR);
        System.out.println(car1);
    }
}