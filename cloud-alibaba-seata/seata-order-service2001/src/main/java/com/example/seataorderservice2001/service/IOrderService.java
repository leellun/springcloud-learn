package com.example.seataorderservice2001.service;

import com.example.seataorderservice2001.domain.Order;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author leellun
 * @since 2022-08-16
 */
public interface IOrderService extends IService<Order> {
    void create(Order order);
}
