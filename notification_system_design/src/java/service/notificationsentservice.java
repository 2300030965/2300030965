package java.service;

import com.campus.notification.model.Notification;

import java.util.List;

public interface notificationsentservice {

    Notification createNotification(Notification notification);

    List<Notification> getUserNotifications(Long userId);

    Notification getNotificationById(Long id);

    Notification markAsRead(Long id);

    void deleteNotification(Long id);
}