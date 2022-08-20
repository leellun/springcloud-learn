package com.example.cloudstreamrocketmqconsumer8812.service;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;

/**
 * 接收消息
 */
@Service
public class ReceiveService {

    @StreamListener(value = Sink.INPUT)
    public void getListener(String message) {
        System.out.println("test-group=1=" + message);
    }
}

