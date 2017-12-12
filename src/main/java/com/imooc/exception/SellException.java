package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * 描述:
 *
 * @outhor sren
 * @create 2017-12-10 12:20
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
       super(resultEnum.getMessage());
       this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}