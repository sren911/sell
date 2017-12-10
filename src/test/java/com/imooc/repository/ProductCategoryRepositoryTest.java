package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by sren on 2017/12/9.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = repository.findOne(1);
        System.out.println(productCategory);
    }

    @Test
    @Transactional
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("小学生最爱");
        productCategory.setCategoryType(6);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
    }

    @Test
    public void updateTest() {

        ProductCategory productCategory = repository.findOne(2);
        productCategory.setCategoryName("男生最爱");
        productCategory.setCategoryType(5);
        ProductCategory productCategory1 = repository.save(productCategory);
        Assert.assertNotNull(productCategory1);
    }

    @Test
    public void findCategoryTypeList() {
        List<Integer> list = Arrays.asList(2, 3, 5);
        List<ProductCategory> categoryList = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, categoryList.size());
    }
}