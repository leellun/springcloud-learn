package com.example.cloudstreamrocketmqprovider8811.controller;

import com.example.cloudstreamrocketmqprovider8811.service.ReceiveService;
import com.example.cloudstreamrocketmqprovider8811.service.SenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: leell
 * Date: 2022/8/20 14:23:33
 */
@RestController
@RequestMapping
public class SenderController {
    @Autowired
    private SenderService senderService;
    @Autowired
    private ReceiveService receiveService;

    @RequestMapping("/send")
    public void send(@RequestParam("msg") String msg) {
        senderService.sendMessage(msg);
    }

    @RequestMapping("/send2")
    public void sendCustom(@RequestParam("msg") String msg) {
        senderService.sendMessage2(msg);
    }

    @RequestMapping("/sinksend")
    public void sinksend(@RequestParam("msg") String msg) {
        receiveService.sendMessage(msg);
    }

    @RequestMapping("/sinksend2")
    public void sinksend2(@RequestParam("msg") String msg) {
        receiveService.sendMessage2(msg);
    }
}
