package com.example.uaa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.newland.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
}
