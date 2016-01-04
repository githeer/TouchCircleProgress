package com.github.cool.circleprogress.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.github.cool.circleprogress.ArcProgress;
import com.github.cool.circleprogress.CircleProgress;
import com.github.cool.circleprogress.DisallowIntercept;
import com.github.cool.circleprogress.DonutProgress;

import butterknife.Bind;
import butterknife.ButterKnife;

public class SwipeBackActivity extends me.imid.swipebacklayout.lib.app.SwipeBackActivity {

    @Bind(R.id.donut)
    DonutProgress donut;
    @Bind(R.id.circle)
    CircleProgress circle;
    @Bind(R.id.arc)
    ArcProgress arc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_back);
        ButterKnife.bind(this);
        donut.setDisallowIntercept(new DisallowIntercept() {
            @Override
            public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
                setSwipeBackEnable(!disallowIntercept);
            }
        });
        donut.setDisallowIntercept(new DisallowIntercept() {
            @Override
            public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
                setSwipeBackEnable(!disallowIntercept);
            }
        });
        arc.setDisallowIntercept(new DisallowIntercept() {
            @Override
            public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
                setSwipeBackEnable(!disallowIntercept);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_normal) {
            startActivity(new Intent(this, MainActivity.class));
            return true;
        } else if (id == R.id.action_view_pager) {
            startActivity(new Intent(this, ViewPagerActivity.class));
            return true;
        } else if (id == R.id.action_custom) {
            startActivity(new Intent(this, SwipeBackActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
