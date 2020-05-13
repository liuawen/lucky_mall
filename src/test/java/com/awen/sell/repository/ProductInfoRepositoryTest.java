package com.awen.sell.repository;

import com.awen.sell.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Liu Awen
 * @create 2020-05-12 23:54
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void saveTest() {
        //Hibernate: select productinf0_.product_id as product_1_1_0_, productinf0_.category_type as category2_1_0_, productinf0_.product_description as product_3_1_0_, productinf0_.product_icon as product_4_1_0_, productinf0_.product_name as product_5_1_0_, productinf0_.product_price as product_6_1_0_, productinf0_.product_status as product_7_1_0_, productinf0_.product_stock as product_8_1_0_ from product_info productinf0_ where productinf0_.product_id=?
        //Hibernate: insert into product_info (category_type, product_description, product_icon, product_name, product_price, product_status, product_stock, product_id) values (?, ?, ?, ?, ?, ?, ?, ?)
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("654321");
        productInfo.setProductName("皮蛋粥粥蛋皮");
        productInfo.setProductPrice(new BigDecimal(6.4));
        productInfo.setProductStock(200);
        productInfo.setProductDescription("很好喝的皮蛋，不好吃的粥");
        productInfo.setProductIcon("https://sell-liuawen.oss-cn-beijing.aliyuncs.com/pidanzhou.jpg\n" +
                "\n");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);

        ProductInfo result = repository.save(productInfo);
        Assert.assertNotNull(result);//不为空 result
    }

    @Test
    public void findByProductStatus() throws Exception {

        List<ProductInfo> productInfoList = repository.findByProductStatus(0);
        Assert.assertNotEquals(0, productInfoList.size());
    }
}