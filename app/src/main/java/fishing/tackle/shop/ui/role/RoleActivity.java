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
        roleModels.add(new RoleModel(R.drawable.sticker, "Daiwa Basia QDX", "Velika i robusna rola namjenjena za dalekometne izbačaje"));
        roleModels.add(new RoleModel(R.drawable.sticker, "Shimano Ultegra", "Velika i robusna rola namjenjena za dalekometne izbačaje"));
        roleModels.add(new RoleModel(R.drawable.poster, "Shimano Aero Technium", "Velika i robusna rola namjenjena za dalekometne izbačaje"));
        roleModels.add(new RoleModel(R.drawable.sticker, "Daiwa Emblem", "Velika i robusna rola namjenjena za dalekometne izbačaje"));
        roleModels.add(new RoleModel(R.drawable.sticker, "Daiwa Tournament s6000T", "Velika i robusna rola namjenjena za dalekometne izbačaje"));
        roleModels.add(new RoleModel(R.drawable.poster, "Shimano Speedcast", "Velika i robusna rola namjenjena za dalekometne izbačaje"));
        roleModels.add(new RoleModel(R.drawable.sticker, "Penn Affinity", "Velika i robusna rola namjenjena za dalekometne izbačaje"));
        roleModels.add(new RoleModel(R.drawable.sticker, "Penn Surfblast", "Velika i robusna rola namjenjena za dalekometne izbačaje"));
        roleModels.add(new RoleModel(R.drawable.poster, "Shimano PowerAero", "Velika i robusna rola namjenjena za dalekometne izbačaje"));
        roleModels.add(new RoleModel(R.drawable.sticker, "Daiwa Infinity", "Velika i robusna rola namjenjena za dalekometne izbačaje"));
        roleModels.add(new RoleModel(R.drawable.sticker, "DAM Quick", "Velika i robusna rola namjenjena za dalekometne izbačaje"));


        roleAdapter = new RoleAdapter(roleModels,this);

        viewPagerRole = findViewById(R.id.viewPagerRole);
        viewPagerRole.setAdapter(roleAdapter);
        viewPagerRole.setPadding(130,0,130,0);

    }
}