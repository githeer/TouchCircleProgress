package com.github.cool.circleprogress.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.github.cool.circleprogress.ArcProgress;
import com.github.cool.circleprogress.CircleProgress;
import com.github.cool.circleprogress.DonutProgress;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ViewPagerActivity extends AppCompatActivity {

    MyPagerAdapter adapter;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        adapter = new MyPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new MyFragment());
        adapter.addFragment(new MyFragment());
        adapter.addFragment(new MyFragment());
        viewPager.setAdapter(adapter);
    }

    class MyPagerAdapter extends FragmentPagerAdapter {
        final List<Fragment> fragments = new ArrayList<>();

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        public void addFragment(Fragment fragment) {
            fragments.add(fragment);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }
    }

    public ViewPager getViewPager() {
        return viewPager;
    }

    public static class MyFragment extends Fragment {

        @Bind(R.id.donut)
        DonutProgress donut;
        @Bind(R.id.circle)
        CircleProgress circle;
        @Bind(R.id.arc)
        ArcProgress arc;

        public MyFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_view_pager, container, false);
            ButterKnife.bind(this, view);
            donut.setPager(((ViewPagerActivity) getActivity()).getViewPager());
            circle.setPager(((ViewPagerActivity) getActivity()).getViewPager());
            arc.setPager(((ViewPagerActivity) getActivity()).getViewPager());
            return view;
        }

        @Override
        public void onDestroyView() {
            super.onDestroyView();
            ButterKnife.unbind(this);
        }
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
