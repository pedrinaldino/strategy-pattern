package com.example.strategypattern.stategy.impl;

import com.example.strategypattern.stategy.NotificationStrategy;
import com.example.strategypattern.stategy.enums.NotificationType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class WhatsappNotificationStrategy implements NotificationStrategy {
    @Override
    public void sendMessage(String message) {
        log.info("Message send to whatsapp {}", message);
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.WHATSAPP;
    }
}
