package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 描述:
 * 订单详情
 *
 * @outhor sren
 * @create 2017-12-10 10:57
 */

@Entity
@Data
@DynamicUpdate
public class OrderDetail {

    @Id
    private String detailId;

    /*订单ID*/
    private String orderId;

    /*商品ID*/
    private String productId;

    /*商品名称*/
    private String productName;

    /*商品单价*/
    private BigDecimal productPrice;

    /*商品数量*/
    private Integer productQuantity;

    /*商品小图*/
    private String productIcon;

    /*创建时间*/
    private Date createTime;

    /*更新时间*/
    private Date updateTime;

}