package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 懒鼠睡zzz on 2017/9/15.
 */

public class Now {
    @SerializedName("tmp")
    public  String temperature;

    @SerializedName("cond")
    public  More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
