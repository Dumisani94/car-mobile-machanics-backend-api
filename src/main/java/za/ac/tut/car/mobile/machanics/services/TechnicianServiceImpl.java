package za.ac.tut.car.mobile.machanics.services;

import org.springframework.stereotype.Service;
import za.ac.tut.car.mobile.machanics.enities.Technician;
import za.ac.tut.car.mobile.machanics.repositories.TechnicianRepository;

import java.util.List;

@Service
public class TechnicianServiceImpl implements TechnicianService {

    private final TechnicianRepository technicianRepository;

    public TechnicianServiceImpl(TechnicianRepository technicianRepository) {
        this.technicianRepository = technicianRepository;
    }

    @Override
    public List<Technician> findTechniciansUsingAddress(String address) {
        return technicianRepository.retrieveUserByAddress(address);
    }
}
