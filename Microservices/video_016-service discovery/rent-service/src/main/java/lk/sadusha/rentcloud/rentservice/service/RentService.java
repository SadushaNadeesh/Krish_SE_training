package lk.sadusha.rentcloud.rentservice.service;

import lk.sadusha.rentcloud.model.rent.Rent;
import lk.sadusha.rentcloud.rentservice.model.DetailResponse;
import lk.sadusha.rentcloud.rentservice.model.Response;
import java.util.List;

public interface RentService {
    Rent save(Rent customer);

    Rent findById(int id);

    List<Rent> findAll();

    DetailResponse findDetailResponse(int id);
}
