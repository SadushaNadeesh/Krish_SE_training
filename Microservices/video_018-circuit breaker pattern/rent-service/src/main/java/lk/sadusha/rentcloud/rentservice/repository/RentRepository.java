package lk.sadusha.rentcloud.rentservice.repository;

import lk.sadusha.rentcloud.model.rent.Rent;
import org.springframework.data.jpa.repository.JpaRepository;
import javax.persistence.criteria.CriteriaBuilder;

public interface RentRepository extends JpaRepository<Rent,Integer>{
}
