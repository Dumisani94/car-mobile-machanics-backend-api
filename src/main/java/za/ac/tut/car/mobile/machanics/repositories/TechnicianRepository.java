package za.ac.tut.car.mobile.machanics.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import za.ac.tut.car.mobile.machanics.enities.Technician;

import java.util.List;

@Repository
public interface TechnicianRepository extends JpaRepository<Technician, Integer> {

    @Query(value = "SELECT * FROM Technician WHERE address =?1",nativeQuery = true)
    List<Technician> retrieveUserByAddress(@Param("address") String address);
}
