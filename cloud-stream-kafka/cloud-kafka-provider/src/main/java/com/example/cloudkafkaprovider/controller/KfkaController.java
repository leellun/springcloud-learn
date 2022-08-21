package com.example.cloudkafkaprovider.controller;

import com.example.cloudkafkaprovider.sender.EsKafkaMessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: leell
 * Date: 2022/8/21 09:49:49
 */
@RestController
public class KfkaController {
    @Autowired
    private EsKafkaMessageSender sender;

    /**
     * kafka发送消息
     */
    @GetMapping("/testKafkaMessageSend")
    public void testKafkaMessageSend(@RequestParam("message") String message) {
        try{
            sender.sendToDefaultChannel(message);
            sender.sendToDefaultChannel(message);
            sender.sendToDefaultChannel(message);
            sender.sendToDefaultChannel(message);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * kafka发送消息
     */
    @GetMapping("/testKafkaMessageSend2")
    public void testKafkaMessageSend2(@RequestParam("message") String message) {
        sender.sendToAlarmChannel(message);
    }
}
