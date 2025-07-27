package com.example.web_socket_notification.service;

import com.example.web_socket_notification.dto.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    public void sendNotification(String message){

        Message message1 = new Message();
        message1.setMessage(message);

        messagingTemplate.convertAndSend("topic/notification", message1);
    }
}
