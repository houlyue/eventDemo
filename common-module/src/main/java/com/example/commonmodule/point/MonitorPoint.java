package com.example.commonmodule.point;

import java.math.BigDecimal;

/**
 * @Author: hzw
 * @createTime: 2023年07月12日 15:46:04
 * @version: 1.0
 * @Description: 监控点位
 */
public class MonitorPoint {

    //点位名称
    private String pointName;

    //点位类型
    private String pointType;

    //经度
    private BigDecimal lon;

    //纬度
    private BigDecimal lat;

    //图片
    private String img;

    public MonitorPoint() {
    }

    public MonitorPoint(String pointName, String pointType, BigDecimal lon, BigDecimal lat, String img) {
        this.pointName = pointName;
        this.pointType = pointType;
        this.lon = lon;
        this.lat = lat;
        this.img = img;
    }

    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    public String getPointType() {
        return pointType;
    }

    public void setPointType(String pointType) {
        this.pointType = pointType;
    }

    public BigDecimal getLon() {
        return lon;
    }

    public void setLon(BigDecimal lon) {
        this.lon = lon;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "MonitorPoint{" +
                "pointName='" + pointName + '\'' +
                ", pointType='" + pointType + '\'' +
                ", lon=" + lon +
                ", lat=" + lat +
                ", img='" + img + '\'' +
                '}';
    }
}
