package com.imooc.dataobject;

import com.imooc.enums.OrderPayEnum;
import com.imooc.enums.OrderStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 描述:
 * 订单实体
 *
 * @outhor sren
 * @create 2017-12-10 10:44
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {

    @Id
    private String orderId;

    /*买家名称*/
    private String buyerName;

    /*买家电话*/
    private String buyerPhone;

    /*买家地址*/
    private String buyerAddress;

    /*买家微信openid*/
    private String buyerOpenid;

    /*订单总金额*/
    private BigDecimal orderAmount;

    /*订单状态，默认0新下单*/
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /*支付状态，默认0未支付*/
    private int payStatus = OrderPayEnum.WAIT.getCode();

    /*创建时间*/
    private Date createTime;

    /*更新时间*/
    private Date updateTime;

}