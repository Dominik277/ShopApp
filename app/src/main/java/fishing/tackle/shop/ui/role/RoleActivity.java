package fishing.tackle.shop.ui.role;


import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import fishing.tackle.shop.R;

public class RoleActivity extends AppCompatActivity {

    ViewPager viewPagerRole;
    RoleAdapter roleAdapter;
    List<RoleModel> roleModels;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role);

        roleModels = new ArrayList<>();
        roleModels.add(new RoleModel(R.drawable.sticker, "Brochure", "Brochure is an informative paper document (often also used for advertising) that can be folded into a template"));
        roleModels.add(new RoleModel(R.drawable.sticker, "Sticker", "Sticker is a type of label: a piece of printed paper, plastic, vinyl, or other material with pressure sensitive adhesive on one side"));
        roleModels.add(new RoleModel(R.drawable.poster, "Poster", "Poster is any piece of printed paper designed to be attached to a wall or vertical surface."));

        roleAdapter = new RoleAdapter(roleModels,this);

        viewPagerRole = findViewById(R.id.viewPagerRole);
        viewPagerRole.setAdapter(roleAdapter);
        viewPagerRole.setPadding(130,0,130,0);

    }
}