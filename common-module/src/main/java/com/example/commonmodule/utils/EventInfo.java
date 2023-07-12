package com.example.commonmodule.utils;

/**
 * @Author: hzw
 * @createTime: 2023年07月11日 17:22:20
 * @version: 1.0
 * @Description:
 */
public class EventInfo {
    private String beanName;

    private Class<?> targetClass;

    private Object[] args;

    private String methodName;

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public Class<?> getTargetClass() {
        return targetClass;
    }

    public void setTargetClass(Class<?> targetClass) {
        this.targetClass = targetClass;
    }

    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
}
