package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 * Created by sren on 2017/12/9.
 */
public interface CategoryService {

    /*查询单个*/
    ProductCategory findOne(Integer categoryId);

    /*查询所有类目*/
    List<ProductCategory> findAll();

    /*通过类目类型查询*/
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
