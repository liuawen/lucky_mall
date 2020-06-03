package com.awen.utils;

import com.awen.enums.CodeEnum;

/**
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create : 2019-07-09
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
