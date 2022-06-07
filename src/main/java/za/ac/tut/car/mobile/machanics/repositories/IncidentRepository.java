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
}
