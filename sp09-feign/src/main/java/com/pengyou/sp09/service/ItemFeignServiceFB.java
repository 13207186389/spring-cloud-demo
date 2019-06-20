package com.pengyou.sp09.service;

import com.pengyou.sp01.pojo.Item;
import com.pengyou.sp01.util.JsonResult;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 降级类
 */
@Component
public class ItemFeignServiceFB implements ItemFeignService {
    @Override
    public JsonResult<List<Item>> getItems(String orderId) {
        return JsonResult.err("无法获取订单商品列表");
    }

    @Override
    public JsonResult decreaseNumber(List<Item> items) {
        return JsonResult.err("无法修改商品库存");
    }
}
