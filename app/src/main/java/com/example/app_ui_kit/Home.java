package com.example.app_ui_kit;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.app_ui_kit.fragment.CalendarFragment;
import com.example.app_ui_kit.fragment.DiscoverFragment;
import com.example.app_ui_kit.fragment.HomeFragment;
import com.example.app_ui_kit.fragment.NotificationFragment;
import com.example.app_ui_kit.fragment.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment = new HomeFragment();
    CalendarFragment calendarFragment = new CalendarFragment();
    DiscoverFragment discoverFragment = new DiscoverFragment();
    ProfileFragment profileFragment = new ProfileFragment();
    NotificationFragment notificationFragment = new NotificationFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.bottom_home);
        bottomNavigationView.setBackground(null);
        bottomNavigationView.getMenu().getItem(2).setEnabled(false);
//        addFragment(android.R.id.content,
//                new DiscoverFragment(),
//                DiscoverFragment.FRAGMENT_TAG);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.bottom_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, homeFragment).commit();
//                item.setIcon(getDrawable(R.drawable.ic_home_selected));
                item.setChecked(true);
                return true;

            case R.id.bottom_calendar:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, calendarFragment).commit();
//                item.setIcon(getDrawable(R.drawable.ic_calendar_selected));
                item.setChecked(true);
                return true;

            case R.id.bottom_discover:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, discoverFragment).commit();
//                item.setIcon(getDrawable(R.drawable.ic_discover_selected));
                item.setChecked(true);
                return true;

            case R.id.bottom_profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, profileFragment).commit();
//                item.setIcon(getDrawable(R.drawable.ic_profile_selected));
                item.setChecked(true);
                return true;

            case R.id.menu:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, notificationFragment).commit();
//                item.setIcon(getDrawable(R.drawable.ic_profile_selected));
                item.setChecked(true);
                return true;
        }

        return false;
    }

//    protected void addFragment(@IdRes int containerViewId,
//                               @NonNull Fragment fragment,
//                               @NonNull String fragmentTag) {
//        getSupportFragmentManager()
//                .beginTransaction()
//                .add(containerViewId, fragment, fragmentTag)
//                .disallowAddToBackStack()
//                .commit();
//    }
//
//    protected void replaceFragment(@IdRes int containerViewId,
//                                   @NonNull Fragment fragment,
//                                   @NonNull String fragmentTag,
//                                   @Nullable String backStackStateName) {
//        getSupportFragmentManager()
//                .beginTransaction()
//                .replace(containerViewId, fragment, fragmentTag)
//                .addToBackStack(backStackStateName)
//                .commit();
//    }

}