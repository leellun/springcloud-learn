package com.example.seatastorageservice2002.controller;


import com.example.seatastorageservice2002.service.IStorageService;
import com.newland.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author leellun
 * @since 2022-08-16
 */
@RestController
@RequestMapping("/storage")
public class StorageController {
    @Autowired
    private IStorageService storageService;

    /**
     * 扣减库存
     * @param productId
     * @param count
     * @return
     */
    @RequestMapping("/decrease")
    public CommonResult decrease(@RequestParam("productId") Long productId,@RequestParam("count") Integer count){
        storageService.decrease(productId,count);
        return new CommonResult(200,"扣减库存成功！");
    }
}

