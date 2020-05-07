package com.indoor.bridge.payment.service;

import com.indoor.bridge.payment.entities.Payment;

import java.util.Date;
import java.util.List;

public interface PaymentService {

    Payment create(Payment payment);

    int delete(Long paymentId);

    Payment getPaymentById(Long paymentId);

    List<Payment> getPaymentListByPeriod(Date startDate, Date endDate);

    List<Payment> getPaymentListByPeriodAndStatus(Date startDate, Date endDate, String status);
}
