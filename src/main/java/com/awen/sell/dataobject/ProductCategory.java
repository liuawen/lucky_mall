package com.awen.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 * @author Liu Awen
 * @create 2019-05-12 21:41
 */
@Entity
@DynamicUpdate
//动态更新？？
@Data
//get set 麻烦  去掉
//@Getter
//帮我们生成 get set jar包的时候

//s_product_category
//@Table(name = "s_product_category")
public class ProductCategory {

    /** 类目id. */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

//    /** 创建时间 .*/
//    private Date createTime;
//    private Date updateTime;


    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }


}