package fishing.tackle.shop;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import fishing.tackle.shop.ui.mamci.MamciActivity;
import fishing.tackle.shop.ui.role.RoleActivity;
import fishing.tackle.shop.ui.satori.SatoriActivity;
import fishing.tackle.shop.ui.stapovi.StapoviActivity;
import fishing.tackle.shop.ui.stapovi.StapoviAdapter;
import fishing.tackle.shop.ui.stapovi.StapoviModel;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private AppBarConfiguration mAppBarConfiguration;
    ViewPager viewPagerMain;
    MainActivityAdapter adapterMain;
    List<MainActivityModel> modelsMain;
    FloatingActionButton fab;
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FloatingActionButton.class));
            }
        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,drawer,toolbar,R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.drawer);
        navigationView.setNavigationItemSelectedListener(this);

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_stapovi, R.id.nav_role, R.id.nav_satori)
                .setDrawerLayout(drawer)
                .build();

        navigationView.bringToFront();
        drawer.requestLayout();

        modelsMain = new ArrayList<>();
        modelsMain.add(new MainActivityModel(R.drawable.kordastowbobbins,R.drawable.kordaboom,"Korda Stow Bobbins","Korda Boom Hooklink","289,99 kn","99,99 kn"));
        modelsMain.add(new MainActivityModel(R.drawable.kordadarkmatter,R.drawable.kordakurvshank,"Korda Dark Matter","Korda KurvShank Hook","69,99","39,99 kn"));
        modelsMain.add(new MainActivityModel(R.drawable.kordatacklebox,R.drawable.foxblacklabel,"Korda Tacklebox","Fox Black Label","199,99 kn","299,99 kn"));
        modelsMain.add(new MainActivityModel(R.drawable.trakkerchair,R.drawable.foxrodpod,"Trakker Chair","Fox Rodpod","4499,99 kn","4499,99 kn"));
        modelsMain.add(new MainActivityModel(R.drawable.trakkerbedchair,R.drawable.delkimtxi,"Trakker Bedchair","Delkim TX-i","1699,99 kn","3899,99 kn"));
        modelsMain.add(new MainActivityModel(R.drawable.mat,R.drawable.centurylandingnet,"JRC Mat","Century Landing Net","579,99 kn","1299,99 kn"));
        modelsMain.add(new MainActivityModel(R.drawable.buttrest,R.drawable.lead,"Sonik Buttrest","Korda lead","49,99 kn","8,99 kn"));
        modelsMain.add(new MainActivityModel(R.drawable.hooklink,R.drawable.readytiedrigs,"Korda Hooklink","Korda Ready Tied Rigs","47,99 kn","29,99 kn"));
        modelsMain.add(new MainActivityModel(R.drawable.sparespoolcase,R.drawable.trakkerbag,"Daiwa Sparespool Case","Trakker Bag","379,99 kn","349,99 kn"));
        modelsMain.add(new MainActivityModel(R.drawable.kordapva,R.drawable.leadpouch,"Korda PVA","Nash Lead Pouch","32,99 kn","199,99 kn"));


        adapterMain = new MainActivityAdapter(modelsMain,this);

        viewPagerMain = findViewById(R.id.viewPagerMain);
        viewPagerMain.setAdapter(adapterMain);
        viewPagerMain.setPadding(130, 0, 130, 0);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.nav_stapovi){
            startActivity(new Intent(MainActivity.this,StapoviActivity.class));
        }else if (id == R.id.nav_role){
            startActivity(new Intent(MainActivity.this,RoleActivity.class));
        }else if (id == R.id.nav_satori){
            startActivity(new Intent(MainActivity.this,SatoriActivity.class));
        }else if(id == R.id.nav_mamci){
            startActivity(new Intent(MainActivity.this,MamciActivity.class));
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}