package com.coolweather.android;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(this);
        Intent intent1=new Intent(MainActivity.this,AutoUpdateService.class);
        startService(intent1);
        Toast.makeText(MainActivity.this,"服务已启动",Toast.LENGTH_SHORT).show();
        if(prefs.getString("weather",null)!=null){
            Intent intent=new Intent(this,WeatherActivity.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
