package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 懒鼠睡zzz on 2017/9/14.
 */

public class Province extends DataSupport {
    private  int id;
    private  String provinceName;
    private  int provinceCode;

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }
}
