package com.example.apa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager vPager = findViewById(R.id.vPager);

        AuthenticationPagerAdapter pAdapter =
                new AuthenticationPagerAdapter(getSupportFragmentManager());
        pAdapter.addFragment(new FragmentConnector());
        pAdapter.addFragment(new FragmentRegister());
        vPager.setAdapter(pAdapter);
        }


        public static class AuthenticationPagerAdapter extends FragmentPagerAdapter
        {

            private final ArrayList<Fragment> frList = new ArrayList<>();

            public AuthenticationPagerAdapter(FragmentManager fm)
            {
                super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
            }

            @NonNull
            @Override
            public Fragment getItem(int position) {
                return frList.get(position);
            }

            @Override
            public int getCount() {
                return frList.size();
            }

            void addFragment(Fragment frag)
            {
                frList.add(frag);
            }

        }
    }