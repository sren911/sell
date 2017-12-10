package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import com.imooc.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by sren on 2017/12/9.
 */
public interface ProductInfoService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在嘉商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询所有的商品
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);
}
