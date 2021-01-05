package fishing.tackle.shop.ui.stapovi;

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

public class StapoviActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stapovi);

        tabLayout = findViewById(R.id.tabLayoutStapovi);
        viewPager = findViewById(R.id.viewPagerStapovi);

        tabLayout.addTab(tabLayout.newTab().setText("Saranski"));
        tabLayout.addTab(tabLayout.newTab().setText("Somovski"));
        tabLayout.addTab(tabLayout.newTab().setText("Morski"));
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

        getSupportActionBar().setTitle("Stapovi");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    class MyAdapter extends FragmentPagerAdapter{

        Context context;
        int totalTabs;

        public MyAdapter(Context c,@NonNull FragmentManager fm,int totalTabs) {
            super(fm);
            context = c;
            this.totalTabs = totalTabs;
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    Saranski saranskiFragment = new Saranski();
                    return saranskiFragment;
                case 1:
                    Somovski somovskiFragment = new Somovski();
                    return somovskiFragment;
                case 2:
                    Morski morskiFragment = new Morski();
                    return morskiFragment;
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