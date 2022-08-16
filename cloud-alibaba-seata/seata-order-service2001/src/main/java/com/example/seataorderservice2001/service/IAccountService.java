package com.example.seataorderservice2001.service;

import com.newland.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * Author: leell
 * Date: 2022/8/16 21:57:54
 */
@FeignClient(value = "seata-account-service")
public interface IAccountService {

    @PostMapping(value = "/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
