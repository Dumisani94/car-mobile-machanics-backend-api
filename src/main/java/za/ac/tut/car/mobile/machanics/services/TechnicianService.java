package za.ac.tut.car.mobile.machanics.services;

import org.springframework.stereotype.Service;
import za.ac.tut.car.mobile.machanics.enities.Technician;

import java.util.List;

@Service
public interface TechnicianService {
    List<Technician> findTechniciansUsingAddress(String address);
}
