package com.newland.tcc.service;

import io.seata.rm.tcc.api.BusinessActionContext;
import io.seata.rm.tcc.api.BusinessActionContextParameter;
import io.seata.rm.tcc.api.TwoPhaseBusinessAction;

/**
 * Created by ipipman on 2020/12/10.
 *
 * @version V1.0
 * @Package com.ipman.seata.tcc.springboot.dubbo.action
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/12/10 11:56 上午
 */
public interface TccActionOne {

    /**
     * 第一个阶段：准备阶段
     *
     * @param actionContext
     * @param a
     * @return
     */
    @TwoPhaseBusinessAction(name = "DubboTccActionOne", commitMethod = "commit", rollbackMethod = "rollback")
    public boolean prepare(BusinessActionContext actionContext,
                           @BusinessActionContextParameter(paramName = "a") int a);

    /**
     * 第二个阶段：提交操作
     *
     * @param actionContext
     * @return
     */
    public boolean commit(BusinessActionContext actionContext);

    /**
     * 第三个阶段：回滚阶段
     *
     * @param actionContext
     * @return
     */
    public boolean rollback(BusinessActionContext actionContext);

}
