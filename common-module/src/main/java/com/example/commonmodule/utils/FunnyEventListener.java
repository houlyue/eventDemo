package com.example.commonmodule.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.lang.reflect.Method;

/**
 * @Author: hzw
 * @createTime: 2023年07月11日 17:25:58
 * @version: 1.0
 * @Description:
 */

@Component
public class FunnyEventListener<T extends CoreEvent> implements ApplicationListener<T> {
    /**
     * 注入spring的上下文
     */
    @Autowired
    private ApplicationContext context;


    public void onApplicationEvent(CoreEvent event) {
        Object target = getTargetOrBean(event);
        // 没有获取到bean对象直接抛出异常
        if (ObjectUtils.isEmpty(target)) {
            throw new RuntimeException("the bean:" + event.getBeanName() + " is not exist");
        }
        // 获取对象的方法数组
        Method[] methods = target.getClass().getMethods();
        Method targetMethod = null;
        // 遍历查询名称符合的方法
        for (Method method : methods) {
            if (method.getName().equals(event.getMethodName())) {
                targetMethod = method;
                break;
            }
        }
        if (ObjectUtils.isEmpty(targetMethod)) {
            throw new RuntimeException("can not find the method: " + event.getMethodName());
        }
        try {
            // 调用方法
            targetMethod.invoke(target, event.getArgs());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Object getTargetOrBean(CoreEvent event) {
        Object target = null;
        //bean的名称和目前类的类型都为空，则直接返回空
        if (ObjectUtils.isEmpty(event.getBeanName()) && ObjectUtils.isEmpty(event.getTargetClass())) {
            return target;
        }
        if (!ObjectUtils.isEmpty(event.getTargetClass())) {
            try {
                target = event.getTargetClass().newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            target = context.getBean(event.getBeanName());
        }
        return target;
    }
}
