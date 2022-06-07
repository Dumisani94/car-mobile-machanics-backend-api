package za.ac.tut.car.mobile.machanics.controllers;

import org.springframework.web.bind.annotation.*;
import za.ac.tut.car.mobile.machanics.enities.Technician;
import za.ac.tut.car.mobile.machanics.services.TechnicianService;

import java.util.List;

@RestController
@RequestMapping("/technicians")
@CrossOrigin("*")
public class TechnicianController {

    private final TechnicianService technicianService;

    public TechnicianController(TechnicianService technicianService) {
        this.technicianService = technicianService;
    }

    @GetMapping("/find/address/{address}")
    public List<Technician> retrieveTechniciansUsingAddress(@PathVariable("address") String address){
        return technicianService.findTechniciansUsingAddress(address);
    }

}
