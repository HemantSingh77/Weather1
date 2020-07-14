package com.hemniks.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView current,date,month,settings;
    ViewPager viewPager;
    PagerViewAdepter pagerViewAdepter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        current = findViewById(R.id.current);
        date = findViewById(R.id.date);
        month = findViewById(R.id.month);
        settings = findViewById(R.id.settings);
        viewPager = findViewById(R.id.fragment_container);


        viewPager.setAdapter(pagerViewAdepter);

        current.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(0);
            }
        });
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(0);
            }
        });
        month.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(0);
            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(0);
            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
               onChangeTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void onChangeTab(int position) {
        if(position == 0){
            current.setTextSize(25);
            current.setTextColor(getColor(R.color.white));

            date.setTextSize(20);
            date.setTextColor(getColor(R.color.yellow));

            month.setTextSize(20);
            month.setTextColor(getColor(R.color.yellow));

            settings.setTextSize(20);
            settings.setTextColor(getColor(R.color.yellow));

        }

        if(position == 1){
            current.setTextSize(20);
            current.setTextColor(getColor(R.color.yellow));

            date.setTextSize(25);
            date.setTextColor(getColor(R.color.white));

            month.setTextSize(20);
            month.setTextColor(getColor(R.color.yellow));

            settings.setTextSize(20);
            settings.setTextColor(getColor(R.color.yellow));

        }
        if(position == 2){
            current.setTextSize(20);
            current.setTextColor(getColor(R.color.yellow));

            date.setTextSize(20);
            date.setTextColor(getColor(R.color.yellow));

            month.setTextSize(25);
            month.setTextColor(getColor(R.color.white));

            settings.setTextSize(20);
            settings.setTextColor(getColor(R.color.yellow));

        }
        if(position == 3){
            current.setTextSize(20);
            current.setTextColor(getColor(R.color.yellow));

            date.setTextSize(20);
            date.setTextColor(getColor(R.color.yellow));

            month.setTextSize(20);
            month.setTextColor(getColor(R.color.yellow));

            settings.setTextSize(25);
            settings.setTextColor(getColor(R.color.white));

        }
    }
}