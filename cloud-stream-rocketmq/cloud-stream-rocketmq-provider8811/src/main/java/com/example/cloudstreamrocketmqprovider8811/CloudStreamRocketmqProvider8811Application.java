package com.example.cloudstreamrocketmqprovider8811;

import com.example.cloudstreamrocketmqprovider8811.sink.MySink;
import com.example.cloudstreamrocketmqprovider8811.source.MySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;

@EnableBinding({Source.class, Sink.class, MySource.class, MySink.class})
@SpringBootApplication
public class CloudStreamRocketmqProvider8811Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudStreamRocketmqProvider8811Application.class, args);
    }

}
