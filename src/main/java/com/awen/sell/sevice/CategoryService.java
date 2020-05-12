package com.awen.sell.sevice;

import com.awen.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @author Liu Awen
 * @create 2019-05-12 23:03
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();
    //type查
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
