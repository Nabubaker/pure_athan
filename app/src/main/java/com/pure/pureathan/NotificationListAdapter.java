package com.pure.pureathan;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RadioButton;

import java.util.ArrayList;
import java.util.List;


public class NotificationListAdapter extends RecyclerView.Adapter<NotificationListAdapter.NotificationHolder> {
    private List<AthanItem> mDataset = new ArrayList<>();

    public NotificationListAdapter(String[] myDataset) {
        int dataSetSize = myDataset.length;
        for (int i=0;i<dataSetSize;i++){
            mDataset.add(new AthanItem(myDataset[i]));
        }
    }


    @Override
    public NotificationListAdapter.NotificationHolder onCreateViewHolder(
            ViewGroup parent, int viewType) {

        RadioButton radioButton = (RadioButton) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.notification_list_item, parent, false);

        NotificationHolder vh = new NotificationHolder(radioButton);
        return vh;
    }


    @Override
    public void onBindViewHolder(NotificationHolder holder, int position) {
        AthanItem item = mDataset.get(position);
        RadioButton radioButton = holder.getRadioButton();

        radioButton.setChecked(item.isChecked());
        radioButton.setText(item.getName());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public void unCheckAll(){
        int dataSetSize = mDataset.size();
        for (int i=0;i<dataSetSize;i++){
            mDataset.get(i).setChecked(false);
        }
    }

    public void check(int position){
        mDataset.get(position).setChecked(true);
    }

    public static class NotificationHolder extends RecyclerView.ViewHolder {
        private RadioButton mRadioButton;

        public NotificationHolder(RadioButton radioButton) {
            super(radioButton);
            mRadioButton = radioButton;
        }

        public RadioButton getRadioButton() {
            return mRadioButton;
        }
    }

    private class AthanItem {
        private String mName;
        private boolean mIsChecked;

        public AthanItem(String name){ this.mName=name;}

        public String getName() {
            return this.mName;
        }

        public boolean isChecked() {
            return mIsChecked;
        }

        public void setChecked(boolean mIsChecked) {
            this.mIsChecked = mIsChecked;
        }
    }

}