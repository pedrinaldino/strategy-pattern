package com.example.strategypattern.controller;

import com.example.strategypattern.stategy.NotificationContext;
import com.example.strategypattern.stategy.enums.NotificationType;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class NotificationController {
    private final NotificationContext notificationContext;

    @GetMapping
    public String sendNotification(@RequestParam String message,
                                   @RequestParam NotificationType notificationType) {
        notificationContext.sendMessage(message, notificationType);
        return message;
    }
}
