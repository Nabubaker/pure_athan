package com.pure.pureathan;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;


public class NotificationListAdapter extends RecyclerView.Adapter<NotificationListAdapter.NotificationHolder> {
    private String[] mDataset;

    public NotificationListAdapter(String[] myDataset) {
        mDataset = myDataset;
    }

    @Override
    public NotificationListAdapter.NotificationHolder onCreateViewHolder(
            ViewGroup parent, int viewType) {
        TextView v = (TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.notification_list_item, parent, false);

        NotificationHolder vh = new NotificationHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(NotificationHolder holder, int position) {
        holder.mTextView.setText(mDataset[position]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }



    public static class NotificationHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public NotificationHolder(TextView v) {
            super(v);
            mTextView = v;
        }
    }
}