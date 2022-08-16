package com.example.seatastorageservice2002.service;

import com.example.seatastorageservice2002.domain.Storage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author leellun
 * @since 2022-08-16
 */
public interface IStorageService extends IService<Storage> {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
