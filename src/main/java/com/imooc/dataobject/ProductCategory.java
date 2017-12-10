package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 描述:
 * 类目
 *
 * @outhor sren
 * @create 2017-12-09 15:19
 * product_category
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory {

    /*类目ID. */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

    /** 更新时间 */
    private Date updateTime;

    /** 创建时间 */
    private Date createTime;

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    public ProductCategory() {
    }
}