package fishing.tackle.shop.ui.mamci;

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
import fishing.tackle.shop.ui.role.Morske;
import fishing.tackle.shop.ui.role.RoleActivity;
import fishing.tackle.shop.ui.role.Saranske;
import fishing.tackle.shop.ui.role.Somovske;

public class MamciActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mamci);

        tabLayout = findViewById(R.id.tabLayoutMamci);
        viewPager = findViewById(R.id.viewPagerMamci);

        tabLayout.addTab(tabLayout.newTab().setText("Boile"));
        tabLayout.addTab(tabLayout.newTab().setText("Kukuruz"));
        tabLayout.addTab(tabLayout.newTab().setText("Pelete"));
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

        getSupportActionBar().setTitle("Mamci");
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
                    Boile boileFragment = new Boile();
                    return boileFragment;
                case 1:
                    Kukuruz kukuruzFragment = new Kukuruz();
                    return kukuruzFragment;
                case 2:
                    Pelete peleteFragment = new Pelete();
                    return peleteFragment;
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
