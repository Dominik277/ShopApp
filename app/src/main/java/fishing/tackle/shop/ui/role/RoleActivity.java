package fishing.tackle.shop.ui.role;

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
import fishing.tackle.shop.ui.stapovi.Morski;
import fishing.tackle.shop.ui.stapovi.Saranski;
import fishing.tackle.shop.ui.stapovi.Somovski;
import fishing.tackle.shop.ui.stapovi.StapoviActivity;

public class RoleActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role);

        tabLayout = findViewById(R.id.tabLayoutRole);
        viewPager = findViewById(R.id.viewPagerRole);

        tabLayout.addTab(tabLayout.newTab().setText("Saranske"));
        tabLayout.addTab(tabLayout.newTab().setText("Somovske"));
        tabLayout.addTab(tabLayout.newTab().setText("Morske"));
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


        getSupportActionBar().setTitle("Role");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    class MyAdapter extends FragmentPagerAdapter{

        Context context;
        int totalTabs;

        public MyAdapter(Context c, @NonNull FragmentManager fm,int totalTabs) {
            super(fm);
            context = c;
            this.totalTabs = totalTabs;
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    Saranske saranskiFragment = new Saranske();
                    return saranskiFragment;
                case 1:
                    Somovske somovskiFragment = new Somovske();
                    return somovskiFragment;
                case 2:
                    Morske morskiFragment = new Morske();
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