package com.example.cloudstreamrocketmqconsumer8812.service;

/**
 * Author: leell
 * Date: 2022/8/20 14:13:11
 */

import com.example.cloudstreamrocketmqconsumer8812.source.MySource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;
import org.springframework.util.MimeTypeUtils;

/**
 * @Description: 发送事务消息
 */
@Component
public class SenderService {

    @Autowired
    private MySource mySource;

    /**
     * 发送事务消息
     * @param msg   消息内容
     */
    public <T> void sendTransactionalMessage(T msg, int num){
        MessageBuilder<T> builder = MessageBuilder.withPayload(msg)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .setHeader("test", String.valueOf(num));
        Message message = builder.build();
        boolean flag = mySource.output1().send(message);
        System.out.println(flag);
    }
}
