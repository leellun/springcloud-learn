package com.example.cloudkafkaprovider.listener;

import com.example.cloudkafkaprovider.channel.EsChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * kafka从不同的通道实现消息的订阅。
 */
@Slf4j
@Component
public class EsKafkaMessageReceiveListener {

    /**
     * 从缺省通道接收消息
     *
     * @param message
     */
    @StreamListener(EsChannel.ES_DEFAULT_INPUT)
    public void receive(Message<String> message) {
        log.info("订阅告警消息：通道 = es_default_input，data = {}", message);
    }

    /**
     * 从告警通道接收消息
     *
     * @param message
     */
    @StreamListener(EsChannel.ES_ALARM_INPUT)
    public void receiveAlarm(Message<String> message) {
        System.out.println("订阅告警消息：" + message);
        log.info("订阅告警消息：通道 = es_alarm_input，data = {}", message);
    }
}


