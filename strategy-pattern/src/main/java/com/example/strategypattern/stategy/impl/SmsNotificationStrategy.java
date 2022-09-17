package com.example.strategypattern.stategy.impl;

import com.example.strategypattern.stategy.NotificationStrategy;
import com.example.strategypattern.stategy.enums.NotificationType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SmsNotificationStrategy implements NotificationStrategy {
    @Override
    public void sendMessage(String message) {
        log.info("Message sendo to SMS {}", message);
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.SMS;
    }
}
