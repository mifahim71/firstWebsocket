package com.example.web_socket_notification.controller;

import com.example.web_socket_notification.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping
    public void notifyAllClients(@RequestParam String message){
        messageService.sendNotification(message);
    }
}
