package com.example.hmilytccaccount.controller;


import com.example.hmilytccaccount.service.IAccountService;
import com.newland.account.dto.AccountDTO;
import com.newland.account.dto.AccountNestedDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author leellun
 * @since 2022-08-17
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    private final IAccountService accountService;

    @Autowired
    public AccountController(IAccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping("/payment")
    public Boolean payment(@RequestBody AccountDTO accountDO) {
        return accountService.payment(accountDO);
    }

    @RequestMapping("/testPayment")
    public Boolean testPayment(@RequestBody AccountDTO accountDO) {
        return accountService.testPayment(accountDO);
    }

    @RequestMapping("/mockWithTryException")
    public Boolean mockWithTryException(@RequestBody AccountDTO accountDO) {
        return accountService.mockWithTryException(accountDO);
    }

    @RequestMapping("/mockWithTryTimeout")
    public Boolean mockWithTryTimeout(@RequestBody AccountDTO accountDO) {
        return accountService.mockWithTryTimeout(accountDO);
    }

    @RequestMapping("/paymentWithNested")
    public Boolean paymentWithNested(@RequestBody AccountNestedDTO nestedDTO) {
        return accountService.paymentWithNested(nestedDTO);
    }

    @RequestMapping("/paymentWithNestedException")
    public Boolean paymentWithNestedException(@RequestBody AccountNestedDTO nestedDTO) {
        return accountService.paymentWithNestedException(nestedDTO);
    }

    @RequestMapping("/findByUserId")
    public BigDecimal findByUserId(@RequestParam("userId") String userId) {
        return accountService.findByUserId(userId).getBalance();
    }
}

