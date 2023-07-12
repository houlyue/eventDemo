package com.example.commonmodule.point;

/**
 * @Author: hzw
 * @createTime: 2023年07月12日 15:57:44
 * @version: 1.0
 * @Description: 测试泛型通用类
 */
public class TestPonit {
    public static void main(String[] args) {
        Point<MonitorPoint> point = new Point<MonitorPoint>();
        point.setObj(new MonitorPoint("1","d",null,null,"66"));
        System.out.println(point.getObj().toString());
    }
}
