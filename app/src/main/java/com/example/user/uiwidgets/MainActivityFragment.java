package com.example.user.uiwidgets;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.user.uiwidgets.Adpters.CustomAdapter;
import com.example.user.uiwidgets.models.Record;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {


    private  ListView simpleList;


    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        simpleList = (ListView) v.findViewById(R.id.simpleListView);

        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        CustomAdapter customAdapter = new CustomAdapter(getActivity().getApplicationContext(), getRecords());
        simpleList.setAdapter(customAdapter);
    }

    private Record[] getRecords(){

        Record[] records = new Record[]{};
        Record record;
        for(int i = 0; i < 100000; i++){
            record = new Record("New Zealand", R.drawable.me);
            records[i]= record;
        }
        return records;

    }
}
