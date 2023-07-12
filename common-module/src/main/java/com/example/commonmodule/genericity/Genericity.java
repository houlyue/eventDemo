package com.example.commonmodule.genericity;

import com.example.commonmodule.utils.CoreEvent;

/**
 * @Author: hzw
 * @createTime: 2023年07月12日 14:53:15
 * @version: 1.0
 * @Description: 练习泛型类
 */
public class Genericity<T extends CoreEvent> {
    public String getGenericity (CoreEvent coreEvent){
        return coreEvent.getBeanName();
    }

}
