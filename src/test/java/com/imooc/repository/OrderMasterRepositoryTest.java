package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by sren on 2017/12/10.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {
    @Autowired
    private OrderMasterRepository repository;

    @Test
    @Transactional
    public void save() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("789");
        orderMaster.setBuyerName("张三");
        orderMaster.setBuyerPhone("18311111111");
        orderMaster.setBuyerAddress("北京");
        orderMaster.setBuyerOpenid("110110");
        orderMaster.setOrderAmount(new BigDecimal(5));

        OrderMaster result = repository.save(orderMaster);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByBuyerOpenid() {
        PageRequest request = new PageRequest(1, 5);
        Page<OrderMaster> masterPage = repository.findByBuyerOpenid("110110", request);
        Assert.assertNotEquals(0, masterPage.getTotalElements());
    }
}