package com.awen.sell.dto;

import lombok.Data;

/**
 * @author Liu Awen
 * @create 2020-05-13 10:03
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
