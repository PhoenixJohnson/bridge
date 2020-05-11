package com.indoor.bridge.payment.controller;

import com.indoor.bridge.payment.service.PaymentService;
import com.indoor.data.entities.Payment;
import com.indoor.data.pojo.dto.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bridge/payment")
public class PaymentContoller {

    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/create")
    public CommonResult<Integer> createPayment(@RequestBody Payment payment) {
        paymentService.create(payment);
        return new CommonResult<>(200, "Create Payment Successfully");
    }

    @GetMapping(value = "/getPaymentById/{Id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("Id") Long paymentId) {

        return new CommonResult<>(200, "Create Payment Successfully", paymentService.getPaymentById(paymentId));
    }
}
