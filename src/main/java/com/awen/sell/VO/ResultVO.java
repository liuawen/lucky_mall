package com.awen.sell.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * @author Liu Awen
 * @create 2020-05-13 0:59
 */
@Data
public class ResultVO<T> {

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;
}
