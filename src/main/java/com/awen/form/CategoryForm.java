package com.awen.form;

import lombok.Data;

/**
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create :  2019-07-09
 */
@Data
public class CategoryForm {

    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;
}
