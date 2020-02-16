package com.aote.bmq;

import com.aote.bmq.service.Produce;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest(classes = BootMqApplication.class)
class BootMqApplicationTests {

    @Resource
    private Produce produce;

    @Test
    void contextLoads() {
        produce.produceMsg();
    }

}
