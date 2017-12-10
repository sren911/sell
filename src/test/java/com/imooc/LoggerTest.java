package com.imooc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 描述:
 *
 * @outhor sren
 * @create 2017-12-09 14:10
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    //private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1() {
       /* logger.info("info...");
        logger.error("error....");
        logger.debug("debug...");*/
        String name = "aaa";
        String password = "123456";
        log.info("info...");
        log.error("error....");
        log.debug("debug...");

        log.info("name: {}, password: {}", name, password);
    }

}