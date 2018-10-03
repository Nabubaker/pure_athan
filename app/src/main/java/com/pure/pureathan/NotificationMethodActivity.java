package com.pure.pureathan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;

public class NotificationMethodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_method);
    }


    public void onRadioButtonClicked(View view) {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.notification_list_recycler_view);
        NotificationListAdapter adapter = (NotificationListAdapter) recyclerView.getAdapter();
        adapter.unCheckAll();

        int childCount = recyclerView.getChildCount();
        for (int i=0;i<childCount;i++){
            ((RadioButton)recyclerView.getChildAt(i)).setChecked(false);
        }

        int position = recyclerView.getChildAdapterPosition(view);
        adapter.check(position);
        ((RadioButton) view).setChecked(true);
        Log.i("Sami:parent ", view.getParent().toString());
        Log.i("Sami:child", view.toString());
    }
}
