package za.ac.tut.car.mobile.machanics.services;

import org.springframework.stereotype.Service;
import za.ac.tut.car.mobile.machanics.enities.Notification;

import java.util.List;

@Service
public interface NotificationService {

    List<Notification> findNotificationsUsingUserId(Long userId);

    Notification saveNotification(Notification notification);

}
