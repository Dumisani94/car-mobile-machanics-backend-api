package za.ac.tut.car.mobile.machanics.services;

import org.springframework.stereotype.Service;
import za.ac.tut.car.mobile.machanics.enities.Incident;
import za.ac.tut.car.mobile.machanics.repositories.IncidentRepository;

import java.util.List;

@Service
public class IncidentServiceImpl implements IncidentService {

    private final IncidentRepository incidentRepository;

    public IncidentServiceImpl(IncidentRepository incidentRepository) {
        this.incidentRepository = incidentRepository;
    }

    @Override
    public Incident saveIncident(Incident incident) {
        return incidentRepository.save(incident);
    }

    @Override
    public List<Incident>  retrieveByUserId(Long userId) {
        return incidentRepository.retrieveUserByUserId(userId);
    }

    @Override
    public List<Incident> retrieveAll() {
        return incidentRepository.findAll();
    }
}
