package fishing.tackle.shop.ui.satori;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import fishing.tackle.shop.R;

public class SatoriActivity extends AppCompatActivity {

    ViewPager viewPagerSatori;
    SatoriAdapter satoriAdapter;
    List<SatoriModel> satoriModels;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satori);

        satoriModels = new ArrayList<>();
        satoriModels.add(new SatoriModel(R.drawable.sticker, "Brochure", "Brochure is an informative paper document (often also used for advertising) that can be folded into a template"));
        satoriModels.add(new SatoriModel(R.drawable.sticker, "Sticker", "Sticker is a type of label: a piece of printed paper, plastic, vinyl, or other material with pressure sensitive adhesive on one side"));
        satoriModels.add(new SatoriModel(R.drawable.poster, "Poster", "Poster is any piece of printed paper designed to be attached to a wall or vertical surface."));
        satoriModels.add(new SatoriModel(R.drawable.namecard, "Namecard", "Business cards are cards bearing business information about a company or individual."));

        satoriAdapter = new SatoriAdapter(satoriModels, this);

        viewPagerSatori = findViewById(R.id.viewPagerSatori);
        viewPagerSatori.setAdapter(satoriAdapter);
        viewPagerSatori.setPadding(130, 0, 130, 0);

    }

}