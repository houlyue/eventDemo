package com.example.commonmodule.utils;

import org.springframework.util.ObjectUtils;

/**
 * @Author: hzw
 * @createTime: 2023年07月11日 17:24:45
 * @version: 1.0
 * @Description:
 */
public class BeanMethodEvent extends CoreEvent{
    /**
     * 功能描述: 创建事件对象的构造函数
     *
     * @param args   方法参数
     * @param method 方法名称
     * @return:
     * @since: v1.0
     * @Author:
     * @Date:
     */
    public static BeanMethodEvent create(Object[] args, String beanName, String method) {
        EventInfo info = new EventInfo();
        // 因为这个是通过调用springboot中注入的bean的方法，所以bean的名称不能为空
        if(ObjectUtils.isEmpty(beanName)){
            throw new RuntimeException("bean name can not be null");
        }
        info.setArgs(args);
        info.setBeanName(beanName);
        info.setMethodName(method);
        return new BeanMethodEvent(info);
    }

    /**
     * 功能描述: 继承了父类的构造函数，修饰为私有的构造函数，不想让上层业务直接通过构造函数传入参数
     *
     * @param info
     * @return:
     * @since: v1.0
     * @Author:
     * @Date:
     */
    private BeanMethodEvent(EventInfo info) {
        super(info);
    }
}
