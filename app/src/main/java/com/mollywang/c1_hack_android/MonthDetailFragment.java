package com.mollywang.c1_hack_android;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class MonthDetailFragment extends Fragment {

    private static final String MONTH_NUM = "month_num";

    public MonthDetailFragment() {
        // Required empty public constructor
    }

    //on all methods, gives access to month
    //call get MONTH_NUM (key)
    public static MonthDetailFragment newInstance(String month) {
        MonthDetailFragment fragment = new MonthDetailFragment();
        Bundle args = new Bundle(); //like hashmap
        args.putString(MONTH_NUM, month); //set key,val
        fragment.setArguments(args); //store in mem
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_month_detail, container, false);
    }

}

