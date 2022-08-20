package com.newland.cloudtxrocketbank2.service.impl;

import com.newland.cloudtxrocketbank2.event.AccountChangeEvent;
import com.newland.cloudtxrocketbank2.mapper.AccountInfoMapper;
import com.newland.cloudtxrocketbank2.service.IAccountInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Administrator
 * @version 1.0
 **/
@Service
@Slf4j
public class AccountInfoServiceImpl implements IAccountInfoService {

    @Autowired
    AccountInfoMapper accountInfoMapper;

    //更新账户，增加金额
    @Override
    @Transactional
    public void addAccountInfoBalance(AccountChangeEvent accountChangeEvent) {
        log.info("bank2更新本地账号，账号：{},金额：{}", accountChangeEvent.getAccountNo(), accountChangeEvent.getAmount());
        if (accountInfoMapper.isExistTx(accountChangeEvent.getTxNo()) > 0) {
            return;
        }
        //增加金额
        accountInfoMapper.updateAccountBalance(accountChangeEvent.getAccountNo(), accountChangeEvent.getAmount());
        //添加事务记录，用于幂等
        accountInfoMapper.addTx(accountChangeEvent.getTxNo());
        if (accountChangeEvent.getAmount() == 4) {
            throw new RuntimeException("人为制造异常");
        }
    }
}
