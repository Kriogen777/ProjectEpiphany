package com.dynduo.ukzn.sycd.in;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MarksFrag extends Fragment {
	
	public MarksFrag(){}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.marks_layout,container, false);
		return rootView;
	}
}
