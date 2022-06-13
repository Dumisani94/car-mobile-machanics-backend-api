package za.ac.tut.car.mobile.machanics.controllers;

import org.springframework.web.bind.annotation.*;
import za.ac.tut.car.mobile.machanics.enities.Incident;
import za.ac.tut.car.mobile.machanics.services.IncidentService;

import java.util.List;

@RestController
@RequestMapping("/incidents")
@CrossOrigin("*")
public class IncidentController {

    private final IncidentService incidentService;

    public IncidentController(IncidentService incidentService) {
        this.incidentService = incidentService;
    }

    @GetMapping("/all")
    public List<Incident> getAll(){
        return incidentService.retrieveAll();
    }

    @PostMapping("/save")
    public Incident save(@RequestBody Incident incident){
        return incidentService.saveIncident(incident);
    }

    @GetMapping("/fetch/user_id/{user_id}")
    public List<Incident>  retrieveUsingUserId(@PathVariable("user_id") String userId){
        return incidentService.retrieveByUserId(Long.parseLong(userId));
    }

    @GetMapping("/admin/fetch/status/{status}")
    public List<Incident>  retrieveByStatus(@PathVariable("status") String status){
        return incidentService.retrieveByStatus(status);
    }

    @GetMapping("/fetch/technician/technician_id/{technician_id}")
    public List<Incident> retrieveByTechnicianId(@PathVariable("technician_id") String technician_id){
        return incidentService.findUserByTechnicianId(Long.parseLong(technician_id));
    }
}
