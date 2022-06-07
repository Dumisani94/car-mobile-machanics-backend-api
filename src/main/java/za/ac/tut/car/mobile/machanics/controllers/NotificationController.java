package za.ac.tut.car.mobile.machanics.controllers;

import org.springframework.web.bind.annotation.*;
import za.ac.tut.car.mobile.machanics.enities.Notification;
import za.ac.tut.car.mobile.machanics.services.NotificationService;

import java.util.List;

@RestController
@RequestMapping("/notifications")
@CrossOrigin("*")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping("/fetch/user_id/{user_id}")
    public List<Notification> retrieveNotificationByUserId(@PathVariable("user_id") String user_id){
        return notificationService.findNotificationsUsingUserId(Long.parseLong(user_id));
    }

    @PostMapping("/save")
    public Notification saveNotification(@RequestBody Notification notification){
        return notificationService.saveNotification(notification);
    }
}
