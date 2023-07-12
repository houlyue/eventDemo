package com.example.producermodule.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * @Author: hzw
 * @createTime: 2023年07月11日 17:29:11
 * @version: 1.0
 * @Description:
 */
@Component("producer")
public class Producer {
    @Autowired
    private ApplicationEventPublisher publisher;

    public void test(String test0, String test1) {
        //注入发布者 向生产者发布消息
//        publisher.publishEvent(BeanMethodEvent.create(new Object[]{"我是谁", "111"},
//                "funnyFilterInvocationSecurityMetadataSource", "test"));

        System.out.println(test1);
    }
}
