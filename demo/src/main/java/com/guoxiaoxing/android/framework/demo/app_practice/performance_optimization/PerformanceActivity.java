package com.guoxiaoxing.android.framework.demo.app_practice.performance_optimization;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.guoxiaoxing.android.framework.demo.R;

public class PerformanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_performance);
        ContextManager.getInstance(this);
    }
}
