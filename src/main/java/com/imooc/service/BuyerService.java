package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * Created by sren on 2017/12/10.
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);
    //取消订单

    OrderDTO cancelOrder(String openid, String orderId);
}
