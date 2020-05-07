package com.indoor.bridge.payment.dao;

import com.indoor.bridge.payment.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Mapper
@Repository
public interface PaymentDao {

    Payment create(Payment payment);

    int delete(Long paymentId);

    Payment getPaymentById(Long paymentId);

    List<Payment> getPaymentListByPeriod(Date startDate, Date endDate);

    List<Payment> getPaymentListByPeriodAndStatus(Date startDate, Date endDate, String status);

}
