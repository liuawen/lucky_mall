package com.awen.sell.enums;

import lombok.Getter;

/**
 * @author Liu Awen
 * @create 2020-05-13 9:47
 */
@Getter
public enum PayStatusEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),

    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}