package com.example.cloudstreamrocketmqprovider8811.sink;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * Author: leell
 * Date: 2022/8/20 14:09:26
 */
public interface MySink {

    String INPUT1 = "input1";

    @Input(MySink.INPUT1)
    SubscribableChannel input1();
}
