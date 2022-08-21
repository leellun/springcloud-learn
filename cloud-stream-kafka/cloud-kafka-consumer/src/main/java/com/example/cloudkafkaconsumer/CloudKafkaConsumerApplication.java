package com.example.cloudkafkaconsumer;

import com.example.cloudkafkaconsumer.channel.EsChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding({EsChannel.class})
public class CloudKafkaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudKafkaConsumerApplication.class, args);
    }

}
