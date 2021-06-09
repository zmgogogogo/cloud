package com.cloud.dao;

import entities.Payment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author zhaoming
 * @date 2021/6/7
 */

@Mapper
public interface PaymentDao {
    @Insert("insert into payment(serial)  values(#{serial});")
    public int create(Payment payment);

    @Select("select * from payment where id=#{id};")
    public Payment getPaymentById(@Param("id") Long id);
}
