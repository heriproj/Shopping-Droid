package com.shoppingDroid.main;

import java.util.ArrayList;
import java.util.BitSet;

import com.shoppingDriod.main.R;
import com.shoppingDroid.jsonParsing.ItemData;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;



public class ListFragment extends Fragment{
	
	private ListAdapter adapter;
	public static final String ARG_SECTION_NUMBER = "section_number";
	private ArrayList<ItemData> data;
	
	public void setData(ArrayList<ItemData> data){
		this.data = data ;
	}
	
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	        // Inflate the layout for this fragment
	        ListView listView = (ListView) this.getActivity().findViewById(R.id.list_tab_view);
			BitSet isFav = new BitSet(data.size());
			adapter = new ListAdapter(this.getActivity(), data, isFav);
			listView.setAdapter(adapter);
			
			return inflater.inflate(R.layout.activity_display_list, container, false);
	    }
}
