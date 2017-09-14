package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 懒鼠睡zzz on 2017/9/14.
 */

public class County extends DataSupport {
    private int id;
    private  String countyName;
    private  String weatherId;
    private  int cityId;

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }
}