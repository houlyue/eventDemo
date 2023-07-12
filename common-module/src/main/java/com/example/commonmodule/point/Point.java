package com.example.commonmodule.point;

/**
 * @Author: hzw
 * @createTime: 2023年07月12日 15:44:50
 * @version: 1.0
 * @Description: 点位通用封装类
 */
public class Point <T>{
    private T obj;

    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return this.obj;
    }
}
