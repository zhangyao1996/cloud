package com.zy.springcloud.controller;


import com.zy.springcloud.entities.CommonResult;
import com.zy.springcloud.entities.Payment;
import com.zy.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhangyao
 * @create 2020/5/29
 */

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String server_port;

    @PostMapping("/payment/insert")
    public CommonResult insert(@RequestBody Payment payment) {
        int result = paymentService.insert(payment);
        if (result > 0) {
            return new CommonResult(200, "插入成功+serverPort:"+server_port,result);
        } else {
            return new CommonResult(400, "插入失败+serverPort:"+server_port,result);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getBySerialId(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("pa:"+payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功+serverPort:"+server_port, payment);
        } else {
            return new CommonResult(400, "没有查询到数据+serverPort:"+server_port, null);
        }
    }
}
