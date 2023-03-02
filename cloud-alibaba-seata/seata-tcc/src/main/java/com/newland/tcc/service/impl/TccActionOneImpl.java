package com.newland.tcc.service.impl;

import com.newland.tcc.service.ResultHolder;
import com.newland.tcc.service.TccActionOne;
import io.seata.rm.tcc.api.BusinessActionContext;
import org.springframework.stereotype.Service;

/**
 * @version V1.0
 * @Description: (用一句话描述该文件做什么)
 */
@Service
public class TccActionOneImpl implements TccActionOne {

    /**
     * 准备
     *
     * @param actionContext
     * @param a
     * @return
     */
    @Override
    public boolean prepare(BusinessActionContext actionContext, int a) {
        String xid = actionContext.getXid();
        System.out.println("TccActionOne prepare, xid:" + xid + ", a:" + a);
        return true;
    }

    /**
     * 提交
     *
     * @param actionContext
     * @return
     */
    @Override
    public boolean commit(BusinessActionContext actionContext) {
        String xid = actionContext.getXid();
        System.out.println("TccActionOne commit, xid:" + xid + ", a:" + actionContext.getActionContext("a"));
        ResultHolder.setActionOneResult(xid, "T");
        return true;
    }

    /**
     * 回滚
     *
     * @param actionContext
     * @return
     */
    @Override
    public boolean rollback(BusinessActionContext actionContext) {
        String xid = actionContext.getXid();
        System.out.println("TccActionOne rollback, xid:" + xid + ", a:" + actionContext.getActionContext("a"));
        ResultHolder.setActionOneResult(xid, "R");
        return true;
    }
}
