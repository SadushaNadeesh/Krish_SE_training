package lk.sadusha.rentcloud.vehicleservice.repository;

import lk.sadusha.rentcloud.model.vehicle.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle,Integer>{
}
