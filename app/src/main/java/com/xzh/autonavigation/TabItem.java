package com.xzh.autonavigation;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class TabItem {

    private String title;
    private int resIds;
    private boolean canScroll;

     public static TabItemBuilder newBuilder(){
         return new TabItemBuilder();
     }

    public static final class TabItemBuilder {
        private String title;
        private int resIds;
        private boolean canScroll;

        private TabItemBuilder() {
        }

        public static TabItemBuilder aTabItem() {
            return new TabItemBuilder();
        }

        public TabItemBuilder withTitle(String title) {
            this.title = title;
            return this;
        }

        public TabItemBuilder withResIds(int resIds) {
            this.resIds = resIds;
            return this;
        }

        public TabItemBuilder withCanScroll(boolean canScroll) {
            this.canScroll = canScroll;
            return this;
        }

        public TabItem build() {
            TabItem tabItem = new TabItem();
            tabItem.title = this.title;
            tabItem.resIds = this.resIds;
            tabItem.canScroll = this.canScroll;
            return tabItem;
        }
    }
}
