package com.example.commonmodule.utils;

import org.springframework.util.ObjectUtils;

/**
 * @Author: hzw
 * @createTime: 2023年07月11日 17:25:24
 * @version: 1.0
 * @Description:
 */
public class TargetMethodEvent extends CoreEvent {
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
    public static TargetMethodEvent create(Object[] args, Class<?> target, String method) {
        EventInfo info = new EventInfo();
        // 因为这个是通过调用springboot中注入的bean的方法，所以bean的名称不能为空
        if(ObjectUtils.isEmpty(target)){
            throw new RuntimeException("target class can not be null");
        }
        info.setArgs(args);
        info.setTargetClass(target);
        info.setMethodName(method);
        return new TargetMethodEvent(info);
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
    private TargetMethodEvent(EventInfo info) {
        super(info);
    }
}
