package com.coolweather.android.gson;

import android.widget.Spinner;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 懒鼠睡zzz on 2017/9/15.
 */

public class Suggestion {
    @SerializedName("comf")
    public  Comfort comfort;

    @SerializedName("cw")
    public  CarWash carWash;

    public Sport sport;


    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public class CarWash{
        @SerializedName("txt")
        public String info;
    }
    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
