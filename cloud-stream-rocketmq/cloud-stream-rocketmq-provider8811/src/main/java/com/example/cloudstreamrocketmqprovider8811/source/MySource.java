package com.example.cloudstreamrocketmqprovider8811.source;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * 自定义Source
 */
public interface MySource {

    String OUTPUT1 = "output1";

    @Output(MySource.OUTPUT1)
    MessageChannel output1();
}

