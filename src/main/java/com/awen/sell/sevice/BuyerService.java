package com.awen.sell.sevice;

import com.awen.sell.dto.OrderDTO;

/**
 * @author Liu Awen
 * @create 2020-05-13 10:08
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}

