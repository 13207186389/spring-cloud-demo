package com.pengyou.sp01.service;

import com.pengyou.sp01.pojo.Item;

import java.util.List;

public interface ItemService {

    List<Item> getItems(String orderId);
    void decreaseNumbers(List<Item> list);
}
