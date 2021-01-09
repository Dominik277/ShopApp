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
        roleModels.add(new RoleModel(R.drawable.dawiabasia45qdx, "Daiwa Basia QDX", "4599,99 kn"));
        roleModels.add(new RoleModel(R.drawable.shimanoultegra, "Shimano Ultegra", "2499,99 kn"));
        roleModels.add(new RoleModel(R.drawable.shimanoaerotechnium, "Shimano Aero Technium", "4899,99 kn"));
        roleModels.add(new RoleModel(R.drawable.daiwaemblem, "Daiwa Emblem", "1899,99 kn"));
        roleModels.add(new RoleModel(R.drawable.dawiatournament, "Daiwa Tournament s6000T", "2499,99 kn"));
        roleModels.add(new RoleModel(R.drawable.shimanospeedcast, "Shimano Speedcast", "949,99 kn"));
        roleModels.add(new RoleModel(R.drawable.pennaffinity, "Penn Affinity", "899,99 kn"));
        roleModels.add(new RoleModel(R.drawable.pennsurfblaster, "Penn Surfblast", "799,99 kn"));
        roleModels.add(new RoleModel(R.drawable.shimanopoweraero, "Shimano PowerAero", "2399,99 kn"));
        roleModels.add(new RoleModel(R.drawable.daiwainfinity, "Daiwa Infinity", "2799,99 kn"));
        roleModels.add(new RoleModel(R.drawable.damquick, "DAM Quick", "659,99 kn"));


        roleAdapter = new RoleAdapter(roleModels,this);

        viewPagerRole = findViewById(R.id.viewPagerRole);
        viewPagerRole.setAdapter(roleAdapter);
        viewPagerRole.setPadding(130,0,130,0);

    }
}