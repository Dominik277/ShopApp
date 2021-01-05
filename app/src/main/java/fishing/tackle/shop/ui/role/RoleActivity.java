package fishing.tackle.shop.ui.role;

import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import fishing.tackle.shop.R;
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

        final StapoviActivity.MyAdapter adapter = new StapoviActivity.MyAdapter(this,getSupportFragmentManager(),
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
}