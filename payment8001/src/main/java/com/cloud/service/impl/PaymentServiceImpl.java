package com.cloud.service.impl;

import com.cloud.dao.PaymentDao;
import com.cloud.service.PaymentService;
import entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhaoming
 * @date 2021/6/7
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }

}
