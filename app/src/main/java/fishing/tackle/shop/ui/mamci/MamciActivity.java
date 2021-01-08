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
        mamciModels.add(new MamciModel(R.drawable.sticker, "Brochure", "Brochure is an informative paper document (often also used for advertising) that can be folded into a template"));
        mamciModels.add(new MamciModel(R.drawable.sticker, "Sticker", "Sticker is a type of label: a piece of printed paper, plastic, vinyl, or other material with pressure sensitive adhesive on one side"));
        mamciModels.add(new MamciModel(R.drawable.poster, "Poster", "Poster is any piece of printed paper designed to be attached to a wall or vertical surface."));
        mamciModels.add(new MamciModel(R.drawable.sticker, "Brochure", "Brochure is an informative paper document (often also used for advertising) that can be folded into a template"));
        mamciModels.add(new MamciModel(R.drawable.sticker, "Sticker", "Sticker is a type of label: a piece of printed paper, plastic, vinyl, or other material with pressure sensitive adhesive on one side"));
        mamciModels.add(new MamciModel(R.drawable.poster, "Poster", "Poster is any piece of printed paper designed to be attached to a wall or vertical surface."));
        mamciModels.add(new MamciModel(R.drawable.sticker, "Brochure", "Brochure is an informative paper document (often also used for advertising) that can be folded into a template"));
        mamciModels.add(new MamciModel(R.drawable.sticker, "Sticker", "Sticker is a type of label: a piece of printed paper, plastic, vinyl, or other material with pressure sensitive adhesive on one side"));
        mamciModels.add(new MamciModel(R.drawable.poster, "Poster", "Poster is any piece of printed paper designed to be attached to a wall or vertical surface."));


        adapterMamci = new MamciAdapter(mamciModels, this);

        viewPagerMamci = findViewById(R.id.viewPagerMamci);
        viewPagerMamci.setAdapter(adapterMamci);
        viewPagerMamci.setPadding(130, 0, 130, 0);

    }
}
