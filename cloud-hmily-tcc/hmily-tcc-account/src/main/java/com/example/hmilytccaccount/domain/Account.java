package com.example.hmilytccaccount.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author leellun
 * @since 2022-08-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String userId;

    /**
     * 用户余额
     */
    private BigDecimal balance;

    /**
     * 冻结金额，扣款暂存余额
     */
    private BigDecimal freezeAmount;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
