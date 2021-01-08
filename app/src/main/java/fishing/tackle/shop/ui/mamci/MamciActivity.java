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
        mamciModels.add(new MamciModel(R.drawable.mainlinecell, "Mainline Cell", "Lagana boila namjenjena za hvatanje velikih šarana"));
        mamciModels.add(new MamciModel(R.drawable.nashkey, "Nash Key", "Lagana boila namjenjena za hvatanje velikih šarana"));
        mamciModels.add(new MamciModel(R.drawable.ccmoorelivesystem, "CCMoore LiveSystem", "Lagana boila namjenjena za hvatanje velikih šarana"));
        mamciModels.add(new MamciModel(R.drawable.mainlinehybrid, "Mainline Hybrid", "Lagana boila namjenjena za hvatanje velikih šarana"));
        mamciModels.add(new MamciModel(R.drawable.kukuruz, "Kukuruz", "Najstariji i najbolji mamac za hvatanje sarana"));
        mamciModels.add(new MamciModel(R.drawable.mainlinepellets, "Mainline Pelete", "Mainline pelete koje otpustaju svoj miris jako dugo"));
        mamciModels.add(new MamciModel(R.drawable.ccmoorespodmix, "CCMoore SpodMix", "Spod mix marke CCMoore koji sluzi kada se peca na zig rig"));
        mamciModels.add(new MamciModel(R.drawable.stickybaitsmanilla, "Sticky Baits Mannila", "Lagana boila namjenjena za hvatanje velikih šarana"));
        mamciModels.add(new MamciModel(R.drawable.kordagoo, "Korda Goo", "Dip marke Korda koji pravi veliki privlacni oblak u vodi"));


        adapterMamci = new MamciAdapter(mamciModels, this);

        viewPagerMamci = findViewById(R.id.viewPagerMamci);
        viewPagerMamci.setAdapter(adapterMamci);
        viewPagerMamci.setPadding(130, 0, 130, 0);

    }
}
