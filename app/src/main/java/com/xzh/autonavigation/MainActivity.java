package com.xzh.autonavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.BaseAdapter;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] titles = {"主页", "发现", "朋友圈", "我的"};
        int[] unselectIcons = {R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};
        int[] selectIcons = {R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};

        AutoNavigation autoNavigation=findViewById(R.id.view_nav);


        autoNavigation
                .withUnselectIcons(unselectIcons)
                .withSelectIcons(selectIcons)
                .withTitles(titles)
                .build();





    }
}
