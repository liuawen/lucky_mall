package com.awen.service;

import com.awen.dto.OrderDTO;

/**
 * 推送消息
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create :  2019-07-09
 */
public interface PushMessageService {

    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
