package com.example.app_ui_kit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.app_ui_kit.adapter.ViewOnboardingAdapter;
import com.google.android.material.tabs.TabLayout;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

public class Onboarding1MainActivity extends AppCompatActivity {
private DotsIndicator dotsIndicator;
private ViewPager mViewPager;
private ViewOnboardingAdapter viewOnboardingAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding1_main);

        mViewPager = findViewById(R.id.vpg);
        dotsIndicator = findViewById(R.id.dots_indicator);

        viewOnboardingAdapter = new ViewOnboardingAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewPager.setAdapter(viewOnboardingAdapter);
        dotsIndicator.attachTo(mViewPager);

        LinearLayout btnLoginFb = findViewById(R.id.btnLoginFb);
        btnLoginFb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Onboarding1MainActivity.this, Home.class);
                startActivity(intent);
            }
        });
        LinearLayout layout_google = findViewById(R.id.layout_google);
        layout_google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Onboarding1MainActivity.this, Home.class);
                startActivity(intent);
            }
        });
    }
}