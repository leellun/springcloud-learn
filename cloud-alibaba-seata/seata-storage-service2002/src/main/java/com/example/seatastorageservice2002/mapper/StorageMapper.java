package com.example.seatastorageservice2002.mapper;

import com.example.seatastorageservice2002.domain.Storage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author leellun
 * @since 2022-08-16
 */
@Repository
public interface StorageMapper extends BaseMapper<Storage> {

    void decrease(@Param("productId") Long productId,@Param("count") Integer count);
}
