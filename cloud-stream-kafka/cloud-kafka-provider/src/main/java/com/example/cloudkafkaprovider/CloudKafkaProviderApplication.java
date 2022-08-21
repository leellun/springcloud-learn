package com.example.cloudkafkaprovider;

import com.example.cloudkafkaprovider.channel.EsChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(EsChannel.class)
public class CloudKafkaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudKafkaProviderApplication.class, args);
    }

}
