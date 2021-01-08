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
        roleModels.add(new RoleModel(R.drawable.dawiabasia45qdx, "Daiwa Basia QDX", "Velika i robusna rola namjenjena za dalekometne izbačaje"));
        roleModels.add(new RoleModel(R.drawable.shimanoultegra, "Shimano Ultegra", "Velika i robusna rola namjenjena za dalekometne izbačaje"));
        roleModels.add(new RoleModel(R.drawable.shimanoaerotechnium, "Shimano Aero Technium", "Velika i robusna rola namjenjena za dalekometne izbačaje"));
        roleModels.add(new RoleModel(R.drawable.daiwaemblem, "Daiwa Emblem", "Velika i robusna rola namjenjena za dalekometne izbačaje"));
        roleModels.add(new RoleModel(R.drawable.dawiatournament, "Daiwa Tournament s6000T", "Velika i robusna rola namjenjena za dalekometne izbačaje"));
        roleModels.add(new RoleModel(R.drawable.shimanospeedcast, "Shimano Speedcast", "Velika i robusna rola namjenjena za dalekometne izbačaje"));
        roleModels.add(new RoleModel(R.drawable.pennaffinity, "Penn Affinity", "Velika i robusna rola namjenjena za dalekometne izbačaje"));
        roleModels.add(new RoleModel(R.drawable.pennsurfblaster, "Penn Surfblast", "Velika i robusna rola namjenjena za dalekometne izbačaje"));
        roleModels.add(new RoleModel(R.drawable.shimanopoweraero, "Shimano PowerAero", "Velika i robusna rola namjenjena za dalekometne izbačaje"));
        roleModels.add(new RoleModel(R.drawable.daiwainfinity, "Daiwa Infinity", "Velika i robusna rola namjenjena za dalekometne izbačaje"));
        roleModels.add(new RoleModel(R.drawable.damquick, "DAM Quick", "Velika i robusna rola namjenjena za dalekometne izbačaje"));


        roleAdapter = new RoleAdapter(roleModels,this);

        viewPagerRole = findViewById(R.id.viewPagerRole);
        viewPagerRole.setAdapter(roleAdapter);
        viewPagerRole.setPadding(130,0,130,0);

    }
}