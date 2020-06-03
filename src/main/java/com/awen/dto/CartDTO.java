package com.awen.dto;

import lombok.Data;

/**
 * 购物车
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create :  2019-07-09
 */
@Data
public class CartDTO {

    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
