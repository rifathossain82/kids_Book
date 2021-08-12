package com.test.mykidsbook.watch_video;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.test.mykidsbook.R;

public class CustomAdapter extends BaseAdapter {
    int[] flags;
    String[] countryNames;
    Context context;
    LayoutInflater inflater;

    CustomAdapter(Context context, String[] countryName, int[] flags){
        this.context=context;
        this.countryNames=countryName;
        this.flags=flags;
    }

    @Override
    public int getCount() {
        return countryNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView==null){
            inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.simple_layout,parent,false);
        }
        ImageView imageView=(ImageView) convertView.findViewById(R.id.mylistimage);
        TextView textView=(TextView) convertView.findViewById(R.id.mylistvideoname);

        imageView.setImageResource(flags[position]);
        textView.setText(countryNames[position]);
        return convertView;
    }
}
