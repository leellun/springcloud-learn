package com.example.seataorderservice2001.service;

import com.newland.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Author: leell
 * Date: 2022/8/16 22:16:50
 */
@FeignClient(value = "seata-storage-service")
public interface IStorageService {
    @RequestMapping("/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
