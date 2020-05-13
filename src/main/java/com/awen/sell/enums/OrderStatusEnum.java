package com.awen.sell.enums;

import lombok.Getter;

/**
 * @author Liu Awen
 * @create 2020-05-13 9:46
 */
@Getter
//就得到 get
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消"),
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
