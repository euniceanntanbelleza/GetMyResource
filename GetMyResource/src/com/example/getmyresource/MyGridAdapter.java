package com.example.getmyresource;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class MyGridAdapter extends BaseAdapter {
	
	Context context;
	ArrayList<Integer> list;
	LayoutInflater inflater;
	
	public MyGridAdapter(Context context, ArrayList<Integer> list) {
		super();
		this.context = context;
		this.list = list;
		this.inflater=LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}
	
	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return list.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		ImageView iv=new ImageView(context);
		iv.setImageResource(list.get(arg0));
		return iv;
		
	}

}
