package com.example.cloudstreamrocketmqprovider8811.service;

import com.example.cloudstreamrocketmqprovider8811.source.MySource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * Author: leell
 * Date: 2022/8/20 14:03:32
 */
@Service
public class SenderService {
    @Autowired
    private Source source;
    @Autowired
    private MySource mysource;

    public void sendMessage(String message){
        boolean send = source.output().send(MessageBuilder.withPayload(message).build());
        System.out.println(send);
    }
    public void sendMessage2(String message){
        boolean send = mysource.output1().send(MessageBuilder.withPayload(message).build());
        System.out.println(send);
    }
}
