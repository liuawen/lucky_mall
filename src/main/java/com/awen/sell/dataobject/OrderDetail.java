package com.awen.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author Liu Awen
 * @create 2020-05-13 9:44
 */
@Entity
//javax.persistence.Entity 的
@Data
public class OrderDetail {

    @Id
    private String detailId;
    //import javax.persistence.Id;
    /** 订单id. */
    private String orderId;

    /** 商品id. */
    private String productId;

    /** 商品名称. */
    private String productName;

    /** 商品单价. */
    private BigDecimal productPrice;

    /** 商品数量. */
    private Integer productQuantity;

    /** 商品小图. */
    private String productIcon;
}

