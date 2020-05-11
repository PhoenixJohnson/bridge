package com.indoor.bridge.payment.service;


import com.indoor.data.entities.Payment;

import java.util.Date;
import java.util.List;

public interface PaymentService {

    Integer create(Payment payment);

    Integer delete(Long paymentId);

    Payment getPaymentById(Long paymentId);

    List<Payment> getPaymentListByPeriod(Date startDate, Date endDate);

    List<Payment> getPaymentListByPeriodAndStatus(Date startDate, Date endDate, String status);
}
