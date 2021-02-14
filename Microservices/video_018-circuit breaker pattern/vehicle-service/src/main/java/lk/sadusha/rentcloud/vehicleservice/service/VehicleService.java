package lk.sadusha.rentcloud.vehicleservice.service;

import lk.sadusha.rentcloud.model.vehicle.Vehicle;
import java.util.List;

public interface VehicleService {
    Vehicle save(Vehicle customer);

    Vehicle findById(int id);

    List<Vehicle> findAll();
}
