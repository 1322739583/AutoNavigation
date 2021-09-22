package com.xzh.autonavigation;

import java.util.ArrayList;
import java.util.List;

public class NavigationUtil {
    public static List<TabItem> createTabItemList(int[] resIds,String[] titles){
        List<TabItem> tabItems=new ArrayList<>();
        for (int i = 0; i <titles.length ; i++) {

//            TabItem tabItem=new TabItem(titles[i],resIds[i],true);
//            TabItem.TabItemBuilder builder=new TabItem.TabItemBuilder();
//            builder.build();
          //  TabItem tabItem=new TabItem(titles[i],resIds[i],true);
//            tabItem.setCanScroll(true);
//            tabItem.setResIds(resIds[i]);
//            tabItem.setTitle(titles[i]);
           // tabItems.add(tabItem);
        }
        return tabItems;
    }
}
