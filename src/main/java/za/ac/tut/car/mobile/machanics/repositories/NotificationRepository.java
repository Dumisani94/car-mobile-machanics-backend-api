package za.ac.tut.car.mobile.machanics.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import za.ac.tut.car.mobile.machanics.enities.Notification;
import za.ac.tut.car.mobile.machanics.enities.Technician;

import java.util.List;

@Repository
public interface NotificationRepository  extends JpaRepository<Notification, Integer> {

    @Query(value = "SELECT * FROM Notification WHERE user_id =?1",nativeQuery = true)
    List<Notification> retrieveNotificationByUserId(@Param("user_id") Long user_id);
}
