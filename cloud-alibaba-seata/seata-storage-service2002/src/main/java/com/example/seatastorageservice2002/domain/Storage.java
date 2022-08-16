package com.example.seatastorageservice2002.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author leellun
 * @since 2022-08-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_storage")
public class Storage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号id
     */
      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商品id
     */
    private Long productId;

    /**
     * 库存
     */
    private Integer total;

    /**
     * 已出售
     */
    private Integer used;

    /**
     * 剩余
     */
    private Integer residue;


}
