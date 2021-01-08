package fishing.tackle.shop.ui.stapovi;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import fishing.tackle.shop.R;

public class StapoviActivity extends AppCompatActivity {

    ViewPager viewPagerStapovi;
    StapoviAdapter adapterStapovi;
    List<StapoviModel> modelsStapovi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stapovi);


        modelsStapovi = new ArrayList<>();
        modelsStapovi.add(new StapoviModel(R.drawable.shimanotribal, "Shimano Tribal TX-9A 13ft", "Cijena: 3172,43 kn", R.string.opisShimanoTribal));
        modelsStapovi.add(new StapoviModel(R.drawable.centuryfma, "Century FMA-2 13ft 3-5oz", "Cijena: 2999,99 kn", R.string.opisCenturyFMA));
        modelsStapovi.add(new StapoviModel(R.drawable.freespirithisive, "Free Spirit HI-S 13ft", "Cijena: 4227,43 kn", R.string.opisFreeSpiritHI_S_ive));
        modelsStapovi.add(new StapoviModel(R.drawable.foxhorizonx5, "Fox Horizon X5 13ft", "Cijena: 1903,75 kn", R.string.opisFoxHorizon));
        modelsStapovi.add(new StapoviModel(R.drawable.greysxlerate, "Greys Xlerate 13ft 3.5lb", "Cijena: 2772,10 kn", R.string.opisGreysXlerate));
        modelsStapovi.add(new StapoviModel(R.drawable.nashnrtoro, "Nash NR Toro 13ft", "Cijena: 2280,10 kn", R.string.opisNashNRTORO));
        modelsStapovi.add(new StapoviModel(R.drawable.centuryadv, "Century ADV-1 13ft", "Cijena: 2143,40 kn", R.string.opisCenturyADV));
        modelsStapovi.add(new StapoviModel(R.drawable.prologicquasar, "Prologic Quasar 13ft", "Cijena: 1679,40 kn", R.string.opisPrologicQuasar));
        modelsStapovi.add(new StapoviModel(R.drawable.daiwainfinitydf, "Daiwa Infinity 13ft", "Cijena: 1679,40 kn", R.string.opisDaiwaInfinity));
        modelsStapovi.add(new StapoviModel(R.drawable.sportexcatapult, "Sportex Catapult 13ft", "Cijena: 1679,40 kn", R.string.opisSportexCatapult));
        modelsStapovi.add(new StapoviModel(R.drawable.dawialongbow, "Dawia Longbow 13ft", "Cijena: 1679,40 kn", R.string.opisDaiwaLongbow));
        modelsStapovi.add(new StapoviModel(R.drawable.jrccontact, "JRC Contact 13ft", "Cijena: 1679,40 kn", R.string.opisJRCContact));
        modelsStapovi.add(new StapoviModel(R.drawable.nashhgun, "Nash H-Gun 13ft", "Cijena: 1679,40 kn", R.string.opisNashHGun));
        modelsStapovi.add(new StapoviModel(R.drawable.shimanoalivio, "Shimano Alivio 13ft", "Cijena: 1679,40 kn", R.string.opisShimanoAlivio));

        adapterStapovi = new StapoviAdapter(modelsStapovi, this);

        viewPagerStapovi = findViewById(R.id.viewPagerStapovi);
        viewPagerStapovi.setAdapter(adapterStapovi);
        viewPagerStapovi.setPadding(130, 0, 130, 0);

    }
}