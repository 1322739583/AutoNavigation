package com.xzh.autonavigation;

import android.content.ClipData;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * 并不需要继承BaseAdapter,不会有划出屏幕的情况，以后再说
 */
public  class NavigationAdapter   {



   // private List<TabItem> tabItems=new ArrayList<>();
    private NavigationModel mModel;
    private Context mContext;

    public NavigationAdapter(Context mContext,NavigationModel mModel ) {
        this.mModel = mModel;
        this.mContext = mContext;
    }

//    @Override
//    public int getCount() {
//        return mModel.getResId().length;
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return tabItems.get(position);
//    }


    public long getItemId(int position) {
        return position;
    }

    /**
     * 不需要像ListView写ViewHolder，因为不存在刷出屏幕的情况，可以通过LinearLayout tab容器获取到里面的所有子View
     * @param position
     * @param convertView
     * @param parent
     * @return
     */

    public View getView(int position, View convertView, ViewGroup parent) {
//        LayoutInflater inflater = LayoutInflater.from(mContext);
//        ViewHolder holder = null;
//        if (convertView == null) {
//            convertView = inflater.inflate(R.layout.tab_item, null);
//            holder = new ViewHolder();
//
//            holder.textView =   convertView.findViewById(R.id.tvTitle);
//            holder.imageView =   convertView.findViewById(R.id.ivIcon);
//            convertView.setTag(holder);
//        }    else {
//            holder = (ViewHolder) convertView.getTag();
//        }
//        holder.imageView.setImageResource(tabItems.get(position).getResIds());
//        holder.textView.setText(tabItems.get(position).getTitle());
        return convertView;
    }

//    static class ViewHolder{
//        ImageView imageView;
//        TextView textView;
//    }


//    public List<TabItem> getTabItems() {
//        return tabItems;
//    }


}
