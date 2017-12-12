package com.imooc.service.impl;

import com.imooc.dataobject.OrderDetail;
import com.imooc.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by sren on 2017/12/10.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderMasterServiceImplTest {

    @Autowired
    private OrderMasterServiceImpl orderMasterService;

    private final String buyerOpenid = "110110";

    @Test
    public void create() throws Exception {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerAddress("北京1");
        orderDTO.setBuyerName("张三");
        orderDTO.setBuyerPhone("183111111");
        orderDTO.setBuyerOpenid(buyerOpenid);

        List<OrderDetail> orderDetails = new ArrayList<>();
        OrderDetail o1 = new OrderDetail();
        o1.setProductId("123456");
        o1.setProductQuantity(10);
        orderDetails.add(o1);

        OrderDetail o2 = new OrderDetail();
        o2.setProductId("456789");
        o2.setProductQuantity(10);
        orderDetails.add(o2);

        orderDTO.setOrderDetailList(orderDetails);
        OrderDTO result = orderMasterService.create(orderDTO);
        Assert.assertNotNull(result);
    }

    @Test
    public void findOne() throws Exception {
        OrderDTO orderDTO = orderMasterService.findOne("1512883737311597927");
        Assert.assertNotNull(orderDTO);
    }

    @Test
    public void findList() throws Exception {
        PageRequest pageRequest = new PageRequest(0, 5);
        Page<OrderDTO> orderDTOPage = orderMasterService.findList(buyerOpenid, pageRequest);
        Assert.assertNotEquals(0, orderDTOPage.getTotalElements());
    }

    @Test
    public void cancel() throws Exception {
        OrderDTO orderDTO = orderMasterService.findOne("1512883737311597927");
        OrderDTO result = orderMasterService.cancel(orderDTO);
        Assert.assertNotNull(result);
    }

    @Test
    public void finish() throws Exception {
        OrderDTO orderDTO = orderMasterService.findOne("1512883285460769673");
        OrderDTO finish = orderMasterService.finish(orderDTO);
        Assert.assertNotNull(finish);
    }

    @Test
    public void paid() throws Exception {
        OrderDTO orderDTO = orderMasterService.findOne("1512883285460769673");
        OrderDTO result = orderMasterService.paid(orderDTO);
        Assert.assertNotNull(result);
    }

}