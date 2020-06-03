package com.awen.dataobject.dao;

import com.awen.dataobject.mapper.ProductCategoryMapper;
import com.awen.dataobject.mapper.ProductCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create :  2019-08-03
 */
public class ProductCategoryDao {

    @Autowired
    ProductCategoryMapper mapper;

    public int insertByMap(Map<String, Object> map) {
        return mapper.insertByMap(map);
    }
}
