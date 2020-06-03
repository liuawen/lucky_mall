package com.awen.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create : 2019-07-09
 */
public class JsonUtil {

    public static String toJson(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
