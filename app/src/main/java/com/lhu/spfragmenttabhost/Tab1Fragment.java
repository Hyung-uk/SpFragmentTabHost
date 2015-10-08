package com.lhu.spfragmenttabhost;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab1Fragment extends Fragment {

    FragmentTabHost tabHost;

    public Tab1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab1, container, false);
        tabHost = (FragmentTabHost) view.findViewById(R.id.tabhost);
        tabHost.setup(getActivity(), getChildFragmentManager(), R.id.realtabcontent);
        tabHost.addTab(tabHost.newTabSpec("ch1").setIndicator("CH1"), Child1Fragment.class, null);
        tabHost.addTab(tabHost.newTabSpec("ch2").setIndicator("CH2"), Child2Fragment.class, null);

        return view;
    }


}
