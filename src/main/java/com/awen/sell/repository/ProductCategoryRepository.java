package com.awen.sell.repository;

import com.awen.sell.dataobject.ProductCategory;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
/**
 * @author Liu Awen
 * @create 2019-05-12 21:51
 */
//extends  JpaRepository<ProductCategory, Integer>
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
