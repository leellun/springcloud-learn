package com.example.cloudstreamrocketmqconsumer8812;

import com.example.cloudstreamrocketmqconsumer8812.sink.MySink;
import com.example.cloudstreamrocketmqconsumer8812.source.MySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding({MySource.class, MySink.class, Sink.class})
@SpringBootApplication
public class CloudStreamRocketmqConsumer8812Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudStreamRocketmqConsumer8812Application.class, args);
    }

}
