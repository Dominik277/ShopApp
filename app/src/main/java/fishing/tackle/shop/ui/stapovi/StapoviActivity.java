package fishing.tackle.shop.ui.stapovi;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import fishing.tackle.shop.R;

public class StapoviActivity extends AppCompatActivity {

    ViewPager viewPager;
    StapoviAdapter adapter;
    List<StapoviModel> models;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stapovi);


        models = new ArrayList<>();
        models.add(new StapoviModel(R.drawable.shimanotribal, "Shimano Tribal TX-9A 13ft Intensity", "Cijena: 3172,43 kn", R.string.opisShimanoTribal));
        models.add(new StapoviModel(R.drawable.centuryfma, "Century FMA-2 13ft 3-5oz", "Cijena: 2999,99 kn", R.string.opisCenturyFMA));
        models.add(new StapoviModel(R.drawable.freespirithisive, "Free Spirit HI-S ive 13ft", "Cijena: 4227,43 kn", R.string.opisFreeSpiritHI_S_ive));
        models.add(new StapoviModel(R.drawable.foxhorizonx5, "Fox Horizon X5 13ft", "Cijena: 1903,75 kn", R.string.opisFoxHorizon));
        models.add(new StapoviModel(R.drawable.greysxlerate, "Greys Xlerate 13ft 3.5lb", "Cijena: 2772,10 kn", R.string.opisGreysXlerate));
        models.add(new StapoviModel(R.drawable.nashnrtoro, "Nash NR Toro 13ft", "Cijena: 2280,10 kn", R.string.opisNashNRTORO));
        models.add(new StapoviModel(R.drawable.centuryadv, "Century ADV-1 13ft", "Cijena: 2143,40 kn", R.string.opisCenturyADV));
        models.add(new StapoviModel(R.drawable.prologicquasar, "Prologic Quasar K1 13ft", "Cijena: 1679,40 kn", R.string.opisPrologicQuasar));
        models.add(new StapoviModel(R.drawable.daiwainfinitydf, "Daiwa Infinity DF 13ft", "Cijena: 1679,40 kn", R.string.opisDaiwaInfinity));
        models.add(new StapoviModel(R.drawable.sportexcatapult, "Sportex Catapult 13ft", "Cijena: 1679,40 kn", R.string.opisSportexCatapult));
        models.add(new StapoviModel(R.drawable.dawialongbow, "Dawia Longbow 13ft", "Cijena: 1679,40 kn", R.string.opisDaiwaLongbow));
        models.add(new StapoviModel(R.drawable.jrccontact, "JRC Contact 13ft", "Cijena: 1679,40 kn", R.string.opisJRCContact));
        models.add(new StapoviModel(R.drawable.nashhgun, "Nash H-Gun 13ft", "Cijena: 1679,40 kn", R.string.opisNashHGun));
        models.add(new StapoviModel(R.drawable.shimanoalivio, "Shimano Alivio 13ft", "Cijena: 1679,40 kn", R.string.opisShimanoAlivio));

        adapter = new StapoviAdapter(models, this);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130, 0, 130, 0);

    }
}