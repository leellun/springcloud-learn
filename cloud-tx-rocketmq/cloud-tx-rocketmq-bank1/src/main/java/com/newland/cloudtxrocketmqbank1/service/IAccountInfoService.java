package com.newland.cloudtxrocketmqbank1.service;

import com.newland.cloudtxrocketmqbank1.event.AccountChangeEvent;

public interface IAccountInfoService {

    //向mq发送转账消息
    void sendUpdateAccountBalance(AccountChangeEvent accountChangeEvent);
    //更新账户，扣减金额
    void doUpdateAccountBalance(AccountChangeEvent accountChangeEvent);

}
