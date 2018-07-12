package com.renzku.dxfConvert.entities;

/**
 * Created by tuzhiming on 2018/7/2.
 */
public class MText extends Text{

    /**
     * Background fill setting:
         0 = Background fill off
         1 = Use background fill color
         2 = Use drawing window color as background fill color
     * group code: 90
     */
    private Integer bgfSetting;

    public Integer getBgfSetting() {
        return bgfSetting;
    }

    public void setBgfSetting(Integer bgfSetting) {
        this.bgfSetting = bgfSetting;
    }
}
