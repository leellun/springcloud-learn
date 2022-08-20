package com.example.cloudstreamrocketmqprovider8811.service;

import com.example.cloudstreamrocketmqprovider8811.sink.MySink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * 接收消息
 */
@Service
public class ReceiveService {

    //spring cloud stream里面发消息通过 Sink 发送
    @Autowired
    private Sink sink;
    @Autowired
    private MySink mysink;

    public void sendMessage(String message) {
        boolean send = sink.input().send(MessageBuilder.withPayload(message).build());
        System.out.println(send);
    }

    public void sendMessage2(String message) {
        boolean send = mysink.input1().send(MessageBuilder.withPayload(message).build());
        System.out.println(send);
    }


    @StreamListener(value = Sink.INPUT)
    public void getListener(String message) {
        System.out.println("test-group=1=" + message);
    }

    @StreamListener(value = MySink.INPUT1)
    public void getListener2(String message) {
        System.out.println("test-group=2=" + message);
    }
}

