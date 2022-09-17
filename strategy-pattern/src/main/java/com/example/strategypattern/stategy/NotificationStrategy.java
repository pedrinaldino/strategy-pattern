package com.example.strategypattern.stategy;

import com.example.strategypattern.stategy.enums.NotificationType;

public interface NotificationStrategy {
    void sendMessage(String message);
    NotificationType notificationType();
}
