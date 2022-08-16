package com.example.cloudalibabasentinelservice8401.controller;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.fastjson.JSONObject;

/**
 * Author: leell
 * Date: 2022/8/16 16:06:43
 */
public class CustomerBlockHandler {
    public static JSONObject handlerException(BlockException exception) {
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("code",444);
        jsonObject.put("message","按照客户自定义进行限流测试OK1");
        return jsonObject;
    }

    public static JSONObject handlerException2(BlockException exception) {
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("code",444);
        jsonObject.put("message","按照客户自定义进行限流测试OK2");
        return jsonObject;
    }
}
