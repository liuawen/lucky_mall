package com.awen.service;

import com.awen.dataobject.SellerInfo;

/**
 * 卖家端
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create : 2019-07-09
 */
public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
