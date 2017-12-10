package com.imooc.enums;

import lombok.Getter;

/**
 * Created by sren on 2017/12/10.
 */

@Getter
public enum OrderPayEnum {

    WAIT(0, "未支付"),
    SUCCESS(1, "支付成功")

    ;
    private Integer code;
    private String msg;

    OrderPayEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
