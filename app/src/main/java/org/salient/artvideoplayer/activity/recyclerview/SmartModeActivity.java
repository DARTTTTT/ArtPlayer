package org.salient.artvideoplayer.activity.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import org.salient.artvideoplayer.BaseActivity;
import org.salient.artvideoplayer.R;
import org.salient.artvideoplayer.activity.listview.ListViewActivity;
import org.salient.artvideoplayer.activity.recyclerview.RecyclerViewActivity;

/**
 * > Created by Mai on 2018/7/17
 * *
 * > Description:
 * *
 */
public class SmartModeActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smart_mode);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.recyclerView:
                startActivity(new Intent(this, RecyclerViewActivity.class));
                break;
        }
    }
}
