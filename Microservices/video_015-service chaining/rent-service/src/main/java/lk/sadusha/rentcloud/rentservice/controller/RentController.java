package lk.sadusha.rentcloud.rentservice.controller;

import lk.sadusha.rentcloud.model.rent.Rent;
import lk.sadusha.rentcloud.rentservice.model.Response;
import lk.sadusha.rentcloud.rentservice.model.SimpleResponse;
import lk.sadusha.rentcloud.rentservice.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/services/rents")
public class RentController {

    @Autowired
    RentService rentService;

    @PostMapping
    public Rent save(@RequestBody Rent rent) {
        return rentService.save(rent);
    }

    @GetMapping(value = "/{id}")
    public Response getRent(@PathVariable int id, @RequestParam(required = false) String type) {

        if(type==null){
            return  new SimpleResponse(rentService.findById(id));
        }else{
            System.out.println("request came on "+LocalDateTime.now() + "  ++++++++++++++++++++++");
            return    rentService.findDetailResponse(id);
        }

    }

    @GetMapping
    public List<Rent> getAllRents() {
        return rentService.findAll();
    }

//    @RequestMapping("/test")
//    public Rent test(){
//        Rent r = new Rent();
//        r.setCustomerId(1);
//        r.setCurrentOdometer(1223);
//        r.setRentFrom(LocalDateTime.now());
//        r.setRentTill(LocalDateTime.of(2021,02,20,00,00,00));
//        r.setReturnLocation("Galle");
//        r.setVehicleId(1);
//
//        return r;
//    }

}
