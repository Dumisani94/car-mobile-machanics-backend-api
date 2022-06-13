package za.ac.tut.car.mobile.machanics.services;

import org.springframework.stereotype.Service;
import za.ac.tut.car.mobile.machanics.enities.Incident;
import java.util.List;

@Service
public interface IncidentService {

    Incident saveIncident(Incident incidentService);

    List<Incident>  retrieveByUserId(Long userId);

    List<Incident>  retrieveByStatus(String status);

    List<Incident>  retrieveAll();

    List<Incident> findUserByTechnicianId(Long parseLong);
}
