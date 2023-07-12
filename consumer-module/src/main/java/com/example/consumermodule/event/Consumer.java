package com.example.consumermodule.event;

import com.example.commonmodule.utils.BeanMethodEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * @Author: hzw
 * @createTime: 2023年07月11日 17:29:11
 * @version: 1.0
 * @Description:
 */
@Component("consumer")
public class Consumer {
    @Autowired
    private ApplicationEventPublisher publisher;

    //在funnyFilterInvocationSecurityMetadataSource这个bean中我放置了如下测试方法
    public void test(String test0,String test1){
        System.out.println(test0);
        //注入发布者 向生产者发布消息
        publisher.publishEvent(BeanMethodEvent.create(new Object[]{"我是谁", "111"},
                "producer", "test"));


    }
}
