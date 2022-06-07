package za.ac.tut.car.mobile.machanics.services;

import org.springframework.stereotype.Service;
import za.ac.tut.car.mobile.machanics.enities.Notification;
import za.ac.tut.car.mobile.machanics.repositories.NotificationRepository;

import java.util.List;

@Service
public class NotificationServiceImpl implements NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationServiceImpl(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @Override
    public List<Notification> findNotificationsUsingUserId(Long userId) {
        return notificationRepository.retrieveNotificationByUserId(userId);
    }

    @Override
    public Notification saveNotification(Notification notification) {
        return notificationRepository.save(notification);
    }
}
