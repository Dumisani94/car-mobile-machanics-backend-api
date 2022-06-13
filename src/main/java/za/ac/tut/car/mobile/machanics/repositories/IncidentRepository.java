package za.ac.tut.car.mobile.machanics.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import za.ac.tut.car.mobile.machanics.enities.Incident;

import java.util.List;

@Repository
public interface IncidentRepository extends JpaRepository<Incident, Integer> {
    @Query(value = "SELECT * FROM Incident WHERE user =?1",nativeQuery = true)
    List<Incident> retrieveUserByUserId(@Param("user") Long user);

    @Query(value = "SELECT * FROM Incident WHERE technician_id =?1 and status = 'Waiting for technician to respond' or status = 'Approved'",nativeQuery = true)
    List<Incident> findByTechnicianId(@Param("technician_id") Long technician_id);

    @Query(value = "SELECT * FROM Incident WHERE status =?1",nativeQuery = true)
    List<Incident> retrieveUserByStatus(@Param("status") String status);
}
