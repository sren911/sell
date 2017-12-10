package com.imooc.dto;

import lombok.Data;

/**
 * 描述:
 *
 * @outhor sren
 * @create 2017-12-10 12:42
 */

@Data
public class CartDTO {

    /*商品id*/
    private String productId;
    /*商品数量*/
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }

    public CartDTO() {
    }
}