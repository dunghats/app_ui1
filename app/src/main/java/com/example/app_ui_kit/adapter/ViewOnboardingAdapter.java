package com.example.app_ui_kit.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.app_ui_kit.fragment.Onboarding1;
import com.example.app_ui_kit.fragment.Onboarding2;
import com.example.app_ui_kit.fragment.Onboarding3;

public class ViewOnboardingAdapter extends FragmentStatePagerAdapter {
    public ViewOnboardingAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Onboarding1();
            case 1:
                return new Onboarding2();
            case 2:
                return new Onboarding3();
            default:
                return new Onboarding1();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = "Onboarding1";
                break;
            case 1:
                title = "Onboarding2";
                break;
            case 2:
                title = "Onboarding3";
                break;
        }
        return title;
    }
}
