package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 描述:
 * 商品信息
 *
 * @outhor sren
 * @create 2017-12-09 17:27
 */

@Entity
@DynamicUpdate
@Data
public class ProductInfo {
    /*商品编号*/
    @Id
    private String productId;

    /*商品名称*/
    private String productName;

    /*单价*/
    private BigDecimal productPrice;

    /*描述*/
    private String productDescription;

    /*0：上架，1：下架*/
    private Integer productStatus;

    /*库存*/
    private Integer productStock;

    /*小图*/
    private String productIcon;

    /*类目编号*/
    private Integer categoryType;

    /*创建时间*/
    private Date createTime;

    /*更新时间*/
    private Date updateTime;


}