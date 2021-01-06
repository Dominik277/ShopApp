package fishing.tackle.shop.ui.stapovi;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import fishing.tackle.shop.R;

public class StapoviActivity extends AppCompatActivity {

    ViewPager viewPager;
    Adapter adapter;
    List<Model> models;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stapovi);


        models = new ArrayList<>();
        models.add(new Model(R.drawable.shimanotribal,"Shimano Tribal TX-9A 13ft Intensity","Cijena: 3172,43 kn","Opis stapa"));
        models.add(new Model(R.drawable.shimanotribal,"Century FMA-2 13ft 3-5oz","Cijena: 2999,99 kn","adfgfg"));
        models.add(new Model(R.drawable.shimanotribal,"Free Spirit HI-S ive 13ft","Cijena: 4227,43 kn","afgadf"));
        models.add(new Model(R.drawable.shimanotribal,"Fox Horizon X5 13ft","Cijena: 1903,75 kn","afgadfg"));
        models.add(new Model(R.drawable.shimanotribal,"Greys Xlerate 13ft 3.5lb","Cijena: 2772,10 kn","afafdg"));
        models.add(new Model(R.drawable.shimanotribal,"Nash NR Toro 13ft","Cijena: 2280,10 kn","asfgafg"));
        models.add(new Model(R.drawable.shimanotribal,"Century ADV-1 13ft","Cijena: 2143,40 kn","asfgafg"));
        models.add(new Model(R.drawable.shimanotribal,"Prologic Quasar K1 13ft","Cijena: 1679,40 kn","asfgfsg"));

        adapter = new Adapter(models,this);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130,0,130,0);

        Integer[] colors_temp = {
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4)
        };

        colors = colors_temp;

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (position < (adapter.getCount() -1) && position < (colors.length - 1)) {
                    viewPager.setBackgroundColor(

                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position + 1]
                            )
                    );
                }

                else {
                    viewPager.setBackgroundColor(colors[colors.length - 1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}