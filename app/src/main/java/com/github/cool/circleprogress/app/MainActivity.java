package com.github.cool.circleprogress.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.github.cool.circleprogress.ArcProgress;
import com.github.cool.circleprogress.Callback;
import com.github.cool.circleprogress.CircleProgress;
import com.github.cool.circleprogress.DonutProgress;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.donut)
    DonutProgress donut;
    @Bind(R.id.circle)
    CircleProgress circle;
    @Bind(R.id.arc)
    ArcProgress arc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        donut.setCallback(new Callback() {
            @Override
            public void update(int progress) {
                Log.d("DonutProgress", "progress:" + progress);
            }
        });

        circle.setCallback(new Callback() {
            @Override
            public void update(int progress) {
                Log.d("CircleProgress", "progress:" + progress);
            }
        });

        arc.setCallback(new Callback() {
            @Override
            public void update(int progress) {
                Log.d("ArcProgress", "progress:" + progress);
            }
        });

    }
}
