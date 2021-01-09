package fishing.tackle.shop.ui.mamci;


import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import fishing.tackle.shop.R;

public class MamciActivity extends AppCompatActivity {

    ViewPager viewPagerMamci;
    MamciAdapter adapterMamci;
    List<MamciModel> mamciModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mamci);

        mamciModels = new ArrayList<>();
        mamciModels.add(new MamciModel(R.drawable.mainlinecell, "Mainline Cell", "99,99 kn"));
        mamciModels.add(new MamciModel(R.drawable.nashkey, "Nash Key", "119,99 kn"));
        mamciModels.add(new MamciModel(R.drawable.ccmoorelivesystem, "CCMoore LiveSystem", "109,99 kn"));
        mamciModels.add(new MamciModel(R.drawable.mainlinehybrid, "Mainline Hybrid", "99,99 kn"));
        mamciModels.add(new MamciModel(R.drawable.kukuruz, "Kukuruz", "9,99 kn"));
        mamciModels.add(new MamciModel(R.drawable.mainlinepellets, "Mainline Pelete", "69,99 kn"));
        mamciModels.add(new MamciModel(R.drawable.ccmoorespodmix, "CCMoore SpodMix", "54,99 kn"));
        mamciModels.add(new MamciModel(R.drawable.stickybaitsmanilla, "Sticky Baits Mannila", "79,99 kn"));
        mamciModels.add(new MamciModel(R.drawable.kordagoo, "Korda Goo", "119,99 kn"));


        adapterMamci = new MamciAdapter(mamciModels, this);

        viewPagerMamci = findViewById(R.id.viewPagerMamci);
        viewPagerMamci.setAdapter(adapterMamci);
        viewPagerMamci.setPadding(130, 0, 130, 0);

    }
}
