package com.example.cloudkafkaprovider.sender;

import com.example.cloudkafkaprovider.channel.EsChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * kafka消息发送器
 *      注入先前定义的通道EsChannel，sendToDefaultChannel、sendToAlarmChannel分别
 *      为我们自定义的两个发送方法，可将消息发送到不同的通道中，每个通道对应一个kafka的主题。
 */
@Slf4j
@Component
public class EsKafkaMessageSender {
    @Autowired
    private EsChannel channel;

    /**
     * 消息发送到默认通道：缺省通道对应缺省主题
     * @param message
     */
    public void sendToDefaultChannel(String message){
        channel.sendEsDefaultMessage().send(MessageBuilder.withPayload(message).build());
    }

    /**
     * 消息发送到告警通道：告警通道对应告警主题
     * @param message
     */
    public void sendToAlarmChannel(String message){
        channel.sendEsAlarmMessage().send(MessageBuilder.withPayload(message).build());
    }
}


