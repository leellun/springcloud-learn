package com.newland.cloudtxrocketbank2.service;

import com.newland.cloudtxrocketbank2.event.AccountChangeEvent;

public interface IAccountInfoService {

    //更新账户，增加金额
    public void addAccountInfoBalance(AccountChangeEvent accountChangeEvent);
}
