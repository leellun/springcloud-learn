package com.example.seataaccountservice2003.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.seataaccountservice2003.domain.Account;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author leellun
 * @since 2022-08-16
 */
public interface AccountMapper extends BaseMapper<Account> {
    /**
     * 扣减账户余额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
