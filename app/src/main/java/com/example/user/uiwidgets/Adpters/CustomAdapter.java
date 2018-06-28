package com.example.user.uiwidgets.Adpters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.uiwidgets.R;
import com.example.user.uiwidgets.models.Record;

public class CustomAdapter extends BaseAdapter {
    Context context;
    Record records[];
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, Record[] records) {
        this.context = context;
        this.records = records;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return records.length;
    }

    @Override
    public Object getItem(int i) {
        return records[i];
    }

    @Override
    public long getItemId(int i) {
        return records[i].getFlag();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.row, null);
        TextView country = (TextView) view.findViewById(R.id.textView);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        country.setText(records[i].getName());
        icon.setImageResource(records[i].getFlag());
        return view;
    }
}