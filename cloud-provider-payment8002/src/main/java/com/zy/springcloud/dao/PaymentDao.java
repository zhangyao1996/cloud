package com.zy.springcloud.dao;

import com.zy.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
     int insert(Payment payment);

     Payment getPaymentById(@Param("id") Long id);
}
