package com.example.seataorderservice2001.controller;


import com.example.seataorderservice2001.domain.Order;
import com.example.seataorderservice2001.service.IOrderService;
import com.newland.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author leellun
 * @since 2022-08-16
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    private IOrderService orderService;

    /**
     * userId=1&productId=1&count=1&money=10
     * @param order
     * @return
     */
    @GetMapping("/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}

