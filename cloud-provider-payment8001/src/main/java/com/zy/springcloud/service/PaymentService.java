package com.zy.springcloud.service;

import com.zy.springcloud.entities.Payment;

public interface PaymentService {

    int insert(Payment payment);

    Payment getPaymentById(Long id);
}
