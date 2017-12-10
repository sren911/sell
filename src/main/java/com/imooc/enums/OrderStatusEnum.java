package com.imooc.enums;

import lombok.Getter;

/**
 * Created by sren on 2017/12/10.
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINFISH(1, "完结"),
    CANCEL(2, "已取消");

    private Integer code;
    private String msg;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
