package fishing.tackle.shop.ui.satori;

import android.content.Context;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import fishing.tackle.shop.R;
import fishing.tackle.shop.ui.mamci.Boile;
import fishing.tackle.shop.ui.mamci.Kukuruz;
import fishing.tackle.shop.ui.mamci.MamciActivity;
import fishing.tackle.shop.ui.mamci.Pelete;

public class SatoriActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satori);

        tabLayout = findViewById(R.id.tabLayoutSatori);
        viewPager = findViewById(R.id.viewPagerSatori);

        tabLayout.addTab(tabLayout.newTab().setText("Bivy"));
        tabLayout.addTab(tabLayout.newTab().setText("Brolly"));
        tabLayout.addTab(tabLayout.newTab().setText("Suncobran"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final MyAdapter adapter = new MyAdapter(this,getSupportFragmentManager(),
                tabLayout.getTabCount());

        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        getSupportActionBar().setTitle("Satori");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    class MyAdapter extends FragmentPagerAdapter {

        Context context;
        int totalTabs;

        public MyAdapter(Context c, @NonNull FragmentManager fm, int totalTabs) {
            super(fm);
            context = c;
            this.totalTabs = totalTabs;
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    Bivy bivyFragment = new Bivy();
                    return bivyFragment;
                case 1:
                    Brolly brollyFragment = new Brolly();
                    return brollyFragment;
                case 2:
                    Suncobran suncobranFragment = new Suncobran();
                    return suncobranFragment;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return totalTabs;
        }
    }

}