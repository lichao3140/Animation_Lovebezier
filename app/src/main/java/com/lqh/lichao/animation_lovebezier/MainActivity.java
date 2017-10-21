package com.lqh.lichao.animation_lovebezier;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * 直播爱心弹幕
 */
public class MainActivity extends AppCompatActivity {

    private LoveLayout loveLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loveLayout = (LoveLayout)findViewById(R.id.loveLayout);
    }

    public void start(View v){
        loveLayout.addLoveIcon();
    }
}
