package fishing.tackle.shop.ui.mamci;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import fishing.tackle.shop.R;
import fishing.tackle.shop.ui.role.RoleActivity;

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
}
