package com.xzh.autonavigation;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;


public class AutoNavigation extends LinearLayout {


    private Context context;

    private NavigationAdapter mAdapter;

    /**
     * 主容器
     */
    private RelativeLayout containerLayout;

    private LinearLayout linearNavigation;

    /**
     * 用于存放tab
     */
    //  private RelativeLayout navgationLayout;

    /**
     * 顶部分割线
     */
    private View topLine;

    /**
     * 存放icon的ImageView
     */
    private List<ImageView> imageViews = new ArrayList<>();

    /**
     * 存放icon文字的TextView
     */
    private List<TextView> textViews = new ArrayList<>();

    private List<LinearLayout> tabs = new ArrayList<>();

    /**
     * 选中图片resId
     */
    private int[] selectIcons;

    /**
     * 未选中图片resId
     */
    private int[] unselectIcons;

    /**
     * 是否可滑动
     */
    private boolean canScroll;

    /**
     * icon文字内容
     */
    private String[] titles;

    public AutoNavigation(Context context) {
        super(context);
        initViews(context, null);
    }

    public AutoNavigation(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initViews(context, attrs);
    }

    private void initViews(Context context, @Nullable AttributeSet attrs) {
        this.context = context;


        //获取布局容器
        containerLayout = (RelativeLayout) View.inflate(context, R.layout.container_layout, null);

        //    navgationLayout = (RelativeLayout) View.inflate(context, R.layout.navigation_layout, null);
        topLine = containerLayout.findViewById(R.id.top_line);

        linearNavigation = containerLayout.findViewById(R.id.linear_navigation);

        // LinearLayout linearTabContent= navgationLayout.findViewById(R.id.linear_tab_content);
        Log.d("AutoNavigation", "initViews");

        addView(containerLayout);

    }


    public int[] getSelectIcons() {
        return selectIcons;
    }

    public void setSelectIcons(int[] selectIcons) {
        this.selectIcons = selectIcons;
    }

    public int[] getUnselectIcons() {
        return unselectIcons;
    }

    public void setUnselectIcons(int[] unselectIcons) {
        this.unselectIcons = unselectIcons;
    }

    public boolean isCanScroll() {
        return canScroll;
    }

    public void setCanScroll(boolean canScroll) {
        this.canScroll = canScroll;
    }

    public String[] getTitles() {
        return titles;
    }

    public void setTitles(String[] titles) {
        this.titles = titles;
    }


    public AutoNavigation withSelectIcons(int[] selectIcons) {
        this.selectIcons = selectIcons;
        return this;
    }

    public AutoNavigation withUnselectIcons(int[] unselectIcons) {
        this.unselectIcons = unselectIcons;
        return this;
    }

    public AutoNavigation withTitles(String[] titles) {
        this.titles = titles;
        return this;
    }




    public AutoNavigation build( ) {

        buildNavigation();
        return this;
    }


    public AutoNavigation withContext(Context context) {
        this.context = context;
        return this;
    }


    private void buildNavigation() {

        for (int i = 0; i < titles.length; i++) {
            Log.d("AutoNavigation", "titles:" + titles[i]);
            Log.d("AutoNavigation", "unselectIcons:" + unselectIcons[i]);

            ImageView imageView = new ImageView(context);
            imageView.setLayoutParams(new LayoutParams(40, 40));
            imageView.setBackgroundColor(Color.BLUE);
            imageView.setImageResource(unselectIcons[i]);

            TextView textView = new TextView(context);
            textView.setLayoutParams(new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            textView.setText(titles[i]);

            LinearLayout linearLayout = new LinearLayout(context);
            LinearLayout.LayoutParams tabLayoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
            tabLayoutParams.weight = 1;
            linearLayout.setOrientation(VERTICAL);
            linearLayout.setGravity(Gravity.CENTER);
            linearLayout.addView(imageView);
            linearLayout.addView(textView);
            linearLayout.setLayoutParams(tabLayoutParams);

            linearNavigation.addView(linearLayout);

        }


    }


}
