package com.example.commonmodule.utils;

import com.example.commonmodule.utils.EventInfo;
import org.springframework.context.ApplicationEvent;

/**
 * @Author: hzw
 * @createTime: 2023年07月11日 17:22:39
 * @version: 1.0
 * @Description:
 */
public abstract class CoreEvent extends ApplicationEvent {
    /**
     * 功能描述: 创建事件对象的构造函数
     *
     * @param info   方法参数
     * @return:
     * @since: v1.0
     * @Author:
     * @Date:
     */
    public CoreEvent(EventInfo info) {
        super(info);
    }

    public Class getTargetClass(){
        return ((EventInfo)this.getSource()).getTargetClass();
    }


    public String getMethodName() {
        return ((EventInfo)this.getSource()).getMethodName();
    }

    public Object[] getArgs() {
        return ((EventInfo)this.getSource()).getArgs();
    }

    public String getBeanName(){
        return ((EventInfo)this.getSource()).getBeanName();
    }
}
