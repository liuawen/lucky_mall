package com.awen.service;

import com.awen.dto.OrderDTO;

/**
 * 买家
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create :  2019-07-09
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
