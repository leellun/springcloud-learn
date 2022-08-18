package com.example.hmilytccaccount.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.hmilytccaccount.domain.Account;
import com.newland.account.dto.AccountDTO;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author leellun
 * @since 2022-08-17
 */
public interface AccountMapper {
    /**
     * Update int.
     *
     * @param accountDTO the account dto
     * @return the int
     */
    @Update("update account set balance = balance - #{amount}," +
            " freeze_amount= freeze_amount + #{amount} ,update_time = now()" +
            " where user_id =#{userId}  and  balance >= #{amount}  ")
    int update(AccountDTO accountDTO);

    /**
     * Update tac int.
     *
     * @param accountDTO the account dto
     * @return the int
     */
    @Update("update account set balance = balance - #{amount}, update_time = now()" +
            " where user_id =#{userId} and balance >= #{amount}  ")
    int updateTAC(AccountDTO accountDTO);

    /**
     * Test update int.
     *
     * @param accountDTO the account dto
     * @return the int
     */
    @Update("update account set balance = balance - #{amount}, update_time = now() " +
            " where user_id =#{userId}  and  balance >= #{amount}  ")
    int testUpdate(AccountDTO accountDTO);

    /**
     * Confirm int.
     *
     * @param accountDTO the account dto
     * @return the int
     */
    @Update("update account set " +
            " freeze_amount= freeze_amount - #{amount}" +
            " where user_id =#{userId}  and freeze_amount >= #{amount} ")
    int confirm(AccountDTO accountDTO);

    /**
     * Cancel int.
     *
     * @param accountDTO the account dto
     * @return the int
     */
    @Update("update account set balance = balance + #{amount}," +
            " freeze_amount= freeze_amount -  #{amount} " +
            " where user_id =#{userId}  and freeze_amount >= #{amount}")
    int cancel(AccountDTO accountDTO);

    /**
     * 根据userId获取用户账户信息
     *
     * @param userId 用户id
     * @return AccountDO account do
     */
    @Select("select id,user_id,balance, freeze_amount from account where user_id =#{userId} limit 1")
    Account findByUserId(String userId);
}
