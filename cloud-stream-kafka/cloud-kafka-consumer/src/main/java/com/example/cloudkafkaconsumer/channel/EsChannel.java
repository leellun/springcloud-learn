package com.example.cloudkafkaconsumer.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * kafka自定义信息通道
 */
public interface EsChannel {

    /**
     * 缺省接收消息通道名称
     */
    String ES_DEFAULT_INPUT = "es_default_input";

    /**
     * 告警接收消息通道名称
     */
    String ES_ALARM_INPUT = "es_alarm_input";

    /**
     * 缺省接收消息通道
     * @return channel 返回缺省信息接收通道
     */
    @Input(ES_DEFAULT_INPUT)
    MessageChannel recieveEsDefaultMessage();

    /**
     * 告警接收消息通道
     * @return channel 返回告警信息接收通道
     */
    @Input(ES_ALARM_INPUT)
    MessageChannel recieveEsAlarmMessage();
}


