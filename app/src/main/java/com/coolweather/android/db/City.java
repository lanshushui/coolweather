package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 懒鼠睡zzz on 2017/9/14.
 */

public class City extends DataSupport {
    private  int id;
    private  String cityName;
    private  int cityCode;

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    private  int provinceId;

    public int getProvinceId() {
        return provinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getId() {
        return id;
    }
}
