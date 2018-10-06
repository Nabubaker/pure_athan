package com.pure.pureathan;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


public class NotificationListAdapter extends RecyclerView.Adapter<NotificationListAdapter.NotificationHolder> {
    private String[] mDataset;

    public NotificationListAdapter(String[] myDataset) {
        mDataset=myDataset;
    }


    @Override
    public NotificationListAdapter.NotificationHolder onCreateViewHolder(
            ViewGroup parent, int viewType) {

        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.notification_list_item, parent, false);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = v.findViewById(R.id.textView);
            }
        });
        NotificationHolder vh = new NotificationHolder(linearLayout);
        return vh;
    }


    @Override
    public void onBindViewHolder(NotificationHolder holder, int position) {
        LinearLayout linearLayout = holder.getLinearLayout();
        TextView textView = (TextView) linearLayout.findViewById(R.id.textView);
        textView.setText(mDataset[position]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    public static class NotificationHolder extends RecyclerView.ViewHolder {
        private LinearLayout mLinearLayout;

        public NotificationHolder(LinearLayout linearLayout) {
            super(linearLayout);
            mLinearLayout = linearLayout;
        }

        public LinearLayout getLinearLayout() {
            return mLinearLayout;
        }
    }
}