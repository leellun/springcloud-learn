package com.newland.provide;

import org.dromara.hmily.core.holder.SingletonHolder;
import org.dromara.hmily.core.provide.ObjectProvide;
import org.dromara.hmily.spring.utils.SpringBeanUtils;

/**
 * Author: leell
 * Date: 2022/8/18 02:00:24
 */
public class SpringObjectProvide implements ObjectProvide {
    public SpringObjectProvide() {
    }

    public Object provide(Class<?> clazz) {
        Object bean = SpringBeanUtils.INSTANCE.getBean(clazz);
        return null == bean ? SingletonHolder.INST.get(clazz) : bean;
    }
}