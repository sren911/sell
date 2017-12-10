package com.imooc.service.impl;

import com.imooc.dataobject.ProductInfo;
import com.imooc.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by sren on 2017/12/9.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {

    @Autowired
    private ProductInfoServiceImpl productInfoService;
    @Test
    public void findOne() throws Exception {
        ProductInfo productInfo = productInfoService.findOne("123456");
        Assert.assertNotNull(productInfo);
    }

    @Test
    public void findUpAll() throws Exception {
        List<ProductInfo> list = productInfoService.findUpAll();
        Assert.assertNotEquals(0, list.size());
    }

    @Test
    public void findAll() throws Exception {
        PageRequest request = new PageRequest(0, 10);

        Page<ProductInfo> productInfoPage = productInfoService.findAll(request);
        //System.out.println(productInfoPage.getTotalElements());
        Assert.assertNotNull(productInfoPage);
    }

    @Test
    public void save() throws Exception {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("456789");
        productInfo.setProductName("小米粥");
        productInfo.setProductPrice(new BigDecimal(2.2));
        productInfo.setProductStock(50);
        productInfo.setProductDescription("好喝");
        productInfo.setProductStatus(ProductStatusEnum.UP.getCode());
        productInfo.setCategoryType(5);
        ProductInfo result = productInfoService.save(productInfo);
        Assert.assertNotNull(result);
    }

}