package com.example.uaa.servie;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.uaa.entity.PermissionEntry;
import com.example.uaa.mapper.PermissionMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 权限查询
 */
@Service
public class PermissionService extends ServiceImpl<PermissionMapper, PermissionEntry> {


    public List<PermissionEntry> getPermissionsByUserId(Integer userId){
        return baseMapper.selectPermissionsByUserId(userId);
    }

}
