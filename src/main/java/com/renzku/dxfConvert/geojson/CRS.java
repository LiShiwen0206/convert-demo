package com.renzku.dxfConvert.geojson;

import java.util.Map;

/**
 * Created by tuzhiming on 2018/7/4.
 */
public class CRS {

    private String type;

    private Map<String,Object> properties;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }
}
