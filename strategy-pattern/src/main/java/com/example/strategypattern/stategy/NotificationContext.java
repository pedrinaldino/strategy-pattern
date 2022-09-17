package com.example.strategypattern.stategy;

import com.example.strategypattern.stategy.enums.NotificationType;
import com.example.strategypattern.stategy.impl.EmailNotificationStrategy;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

@AllArgsConstructor
@Component
@Slf4j
public class NotificationContext {
    private final Map<NotificationType, NotificationStrategy> sendNotificationByType;

    public void sendMessage(String message, NotificationType notificationType) {
        NotificationStrategy notificationStrategy = sendNotificationByType.getOrDefault(notificationType, new EmailNotificationStrategy());
        notificationStrategy.sendMessage(message);
    }
}
