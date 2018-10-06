/*
    Author: Sami Ibrahim
    Email: shassen95@gmail.com
 */

package com.pure.pureathan;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

public class NotificationListFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                         Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_notification_list, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.notification_list_recycler_view);


        /* Changes in content don't change the layout size of the RecyclerView */
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);


        String[] notificationMethods = {
                "Mecca", "Medina", "Egypt", "Single Beep", "Double Beep", "Triple Beep",
                "Mecca", "Medina", "Egypt", "Single Beep", "Double Beep", "Triple Beep",
                "Mecca", "Medina", "Egypt", "Single Beep", "Double Beep", "Triple Beep",
                "Mecca", "Medina", "Egypt", "Single Beep", "Double Beep", "Triple Beep",
                "Mecca", "Medina", "Egypt", "Single Beep", "Double Beep", "Triple Beep",
                "Mecca", "Medina", "Egypt", "Single Beep", "Double Beep", "Triple Beep",
                "Mecca", "Medina", "Egypt", "Single Beep", "Double Beep", "Triple Beep",
                "Mecca", "Medina", "Egypt", "Single Beep", "Double Beep", "Triple Beep",
                "Mecca", "Medina", "Egypt", "Single Beep", "Double Beep", "Triple Beep",
                "Mecca", "Medina", "Egypt", "Single Beep", "Double Beep", "Triple Beep"
        };
        //String[] notificationMethods = {};

        mAdapter = new NotificationListAdapter(notificationMethods);
        mRecyclerView.setAdapter(mAdapter);

        return view;
    }
}
