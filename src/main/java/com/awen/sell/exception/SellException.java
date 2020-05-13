package com.awen.sell.exception;

import com.awen.sell.enums.ResultEnum;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * @author Liu Awen
 * @create 2020-05-13 10:11
 */
public class SellException extends RuntimeException {
    private Integer code;
    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
