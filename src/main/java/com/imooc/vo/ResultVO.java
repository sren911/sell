package com.imooc.vo;

import lombok.Data;

/**
 * 描述: http请求返回的对象
 *
 * @outhor sren
 * @create 2017-12-09 22:57
 */
@Data
public class ResultVO<T> {
    /*错误码*/
    private Integer code;

    /*提示信息*/
    private String msg;

    /*具体内容*/
    private T data;
}