package com.indoor.bridge.payment.service.impl;

import com.indoor.bridge.payment.dao.PaymentDao;
import com.indoor.bridge.payment.entities.Payment;
import com.indoor.bridge.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public Payment create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public int delete(Long paymentId) {
        return paymentDao.delete(paymentId);
    }

    @Override
    public Payment getPaymentById(Long paymentId) {
        return paymentDao.getPaymentById(paymentId);
    }

    @Override
    public List<Payment> getPaymentListByPeriod(Date startDate, Date endDate) {
        return paymentDao.getPaymentListByPeriod(startDate, endDate);
    }

    @Override
    public List<Payment> getPaymentListByPeriodAndStatus(Date startDate, Date endDate, String status) {
        return paymentDao.getPaymentListByPeriodAndStatus(startDate, endDate, status);
    }
}
