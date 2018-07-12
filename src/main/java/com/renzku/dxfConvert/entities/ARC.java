package com.renzku.dxfConvert.entities;

/**
 * Created by tuzhiming on 2018/7/2.
 */
public class ARC extends Circle {

    /**
     * 开始角度
     * 0-2
     */
    private Double startAngle;

    /**
     * 结束角度
     * 0-2
     */
    private Double endAngle;

    public Double getStartAngle() {
        return startAngle;
    }

    public void setStartAngle(Double startAngle) {
        this.startAngle = startAngle;
    }

    public Double getEndAngle() {
        return endAngle;
    }

    public void setEndAngle(Double endAngle) {
        this.endAngle = endAngle;
    }
}
