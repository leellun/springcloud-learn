package com.example.cloudalibabasentinelservice8401.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: leell
 * Date: 2022/8/16 15:59:33
 */
@RestController
public class RateLimitController {

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource",blockHandler = "handleException")
    public JSONObject byResource(){
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("code",200);
        jsonObject.put("message","按照名称限流测试OK");
        return jsonObject;
    }

    public JSONObject handleException(BlockException exception){
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("code",444);
        jsonObject.put("message",exception.getClass().getCanonicalName()+"\t 服务不可用");
        return jsonObject;
    }
    @GetMapping("/rateLimit/byUrl")
    @SentinelResource("byUrl")
    public JSONObject byUrl(){
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("code",200);
        jsonObject.put("message","按照url限流测试OK");
        return jsonObject;
    }
    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
            blockHandlerClass = CustomerBlockHandler.class,
            blockHandler = "handlerException2")
    public JSONObject customerBlockHandler(){
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("code",200);
        jsonObject.put("message","按照自定义限流测试OK");
        return jsonObject;
    }
}
