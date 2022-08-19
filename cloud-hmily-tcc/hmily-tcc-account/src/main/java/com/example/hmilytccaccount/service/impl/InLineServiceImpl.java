package com.example.hmilytccaccount.service.impl;

import com.example.hmilytccaccount.service.InLineService;
import org.dromara.hmily.annotation.HmilyTCC;
import org.springframework.stereotype.Component;

@Component
public class InLineServiceImpl implements InLineService {

    @Override
    @HmilyTCC(confirmMethod = "confirm", cancelMethod = "cancel")
    public void test() {
        System.out.println("执行inline try......");
    }

    /**
     * Confrim.
     */
    public void confirm() {
        System.out.println("执行inline confirm......");
    }

    /**
     * Cancel.
     */
    public void cancel() {
        System.out.println("执行inline cancel......");
    }
}
