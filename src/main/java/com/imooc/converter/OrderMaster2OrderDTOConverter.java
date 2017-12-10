package com.imooc.converter;

import com.imooc.dataobject.OrderMaster;
import com.imooc.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 描述:
 *
 * @outhor sren
 * @create 2017-12-10 15:06
 */
public class OrderMaster2OrderDTOConverter {

    public static OrderDTO convert(OrderMaster orderMaster) {

        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster, orderDTO);

        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList) {

        List<OrderDTO> orderDTOList = orderMasterList.stream().map(e -> convert(e)).collect(Collectors.toList());

        return orderDTOList;
    }
}