package com.xzh.autonavigation;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class NavigationModel {
    private int[] selectIcon;
    private int[] unselectIcon;
    private String[] titles;
    private boolean canScroll;
    private int curSelectIndex=0;
    private OnTabSelectListener tabSelectListener;

    interface OnTabSelectListener{
        void onSelected();
    }


}
