package za.ac.tut.car.mobile.machanics.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import za.ac.tut.car.mobile.machanics.enities.CardDetails;

import java.util.List;

@Repository
public interface CardDetailsRepository extends JpaRepository<CardDetails, Integer> {
    @Query(value = "SELECT * FROM Card_Details WHERE user =?1",nativeQuery = true)
    List<CardDetails> retrieveCardById(@Param("id") Long id);
}
