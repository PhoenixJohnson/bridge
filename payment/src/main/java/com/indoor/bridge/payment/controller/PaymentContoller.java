package com.indoor.bridge.payment.controller;

import com.indoor.bridge.payment.dto.CommonResult;
import com.indoor.bridge.payment.entities.Payment;
import com.indoor.bridge.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bridge/payment")
public class PaymentContoller {

    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/create")
    public CommonResult<Payment> createPayment(@RequestBody Payment payment) {
        return new CommonResult<>(200, "Create Payment Successfully", paymentService.create(payment));
    }
}
