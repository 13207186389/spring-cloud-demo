package com.pengyou.sp09.service;

import com.pengyou.sp01.pojo.Order;
import com.pengyou.sp01.util.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="order-service",fallback = OrderFeignServiceFB.class)
public interface OrderFeignService {

    @GetMapping("/{orderId}")
    JsonResult<Order> getOrder(@PathVariable("orderId") String orderId);

    @GetMapping("/")
    JsonResult addOrder();
}
