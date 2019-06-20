package com.pengyou.sp01.service;

import com.pengyou.sp01.pojo.Order;

public interface OrderService {

    Order getOrder(String orderId);
    void addOrder(Order order);
}
