package com.example.uaa.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 权限
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_permission")
public class PermissionEntry {

    @TableId
    private Integer id;

    private String code;

    private String description;

    private String url;

}
