package com.awen.sell.enums;

import lombok.Getter;

/**
 * @author Liu Awen
 * @create 2020-05-13 0:19
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}