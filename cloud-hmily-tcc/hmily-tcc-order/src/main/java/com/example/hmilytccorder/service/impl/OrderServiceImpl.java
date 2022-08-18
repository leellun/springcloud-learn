package com.example.hmilytccorder.service.impl;

import com.example.hmilytccorder.domain.Order;
import com.example.hmilytccorder.enums.OrderStatusEnum;
import com.example.hmilytccorder.mapper.OrderMapper;
import com.example.hmilytccorder.service.IOrderService;
import com.example.hmilytccorder.service.IPaymentService;
import org.dromara.hmily.common.utils.IdWorkerUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author leellun
 * @since 2022-08-17
 */
@Service
public class OrderServiceImpl implements IOrderService {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);

    private final OrderMapper orderMapper;

    private final IPaymentService paymentService;

    @Autowired(required = false)
    public OrderServiceImpl(OrderMapper orderMapper, IPaymentService paymentService) {
        this.orderMapper = orderMapper;
        this.paymentService = paymentService;
    }

    @Override
    public String orderPay(Integer count, BigDecimal amount) {
        Order order = saveOrder(count, amount);
        long start = System.currentTimeMillis();
        paymentService.makePayment(order);
        System.out.println("hmily-cloud分布式事务耗时：" + (System.currentTimeMillis() - start));
        return "success";
    }

    @Override
    public String testOrderPay(Integer count, BigDecimal amount) {
        Order order = saveOrder(count, amount);
        paymentService.testMakePayment(order);
        return "success";
    }

    @Override
    public String mockInventoryWithTryException(Integer count, BigDecimal amount) {
        Order order = saveOrder(count, amount);
        return paymentService.mockPaymentInventoryWithTryException(order);
    }

    @Override
    public String mockAccountWithTryException(Integer count, BigDecimal amount) {
        Order order = saveOrder(count, amount);
        return paymentService.mockPaymentAccountWithTryException(order);
    }

    /**
     * 模拟在订单支付操作中，库存在try阶段中的timeout
     *
     * @param count  购买数量
     * @param amount 支付金额
     * @return string
     */
    @Override
    public String mockInventoryWithTryTimeout(Integer count, BigDecimal amount) {
        Order order = saveOrder(count, amount);
        return paymentService.mockPaymentInventoryWithTryTimeout(order);
    }

    @Override
    public String mockAccountWithTryTimeout(Integer count, BigDecimal amount) {
        Order order = saveOrder(count, amount);
        return paymentService.mockPaymentAccountWithTryTimeout(order);
    }

    @Override
    public String orderPayWithNested(Integer count, BigDecimal amount) {
        Order order = saveOrder(count, amount);
        return paymentService.makePaymentWithNested(order);
    }

    @Override
    public String orderPayWithNestedException(Integer count, BigDecimal amount) {
        Order order = saveOrder(count, amount);
        return paymentService.makePaymentWithNestedException(order);
    }

    @Override
    public void updateOrderStatus(Order order) {
        orderMapper.update(order);
    }

    private Order saveOrder(Integer count, BigDecimal amount) {
        final Order order = buildOrder(count, amount);
        orderMapper.save(order);
        return order;
    }

    private Order buildOrder(Integer count, BigDecimal amount) {
        LOGGER.debug("构建订单对象");
        Order order = new Order();
        order.setCreateTime(LocalDateTime.now());
        order.setNumber(String.valueOf(IdWorkerUtils.getInstance().createUUID()));
        //demo中的表里只有商品id为 1的数据
        order.setProductId("1");
        order.setStatus(OrderStatusEnum.NOT_PAY.getCode());
        order.setTotalAmount(amount);
        order.setCount(count);
        //demo中 表里面存的用户id为10000
        order.setUserId("10000");
        return order;
    }
}
