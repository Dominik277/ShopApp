package fishing.tackle.shop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import fishing.tackle.shop.ui.stapovi.StapoviModel;

public class MainActivityAdapter extends PagerAdapter {

    private List<MainActivityModel> modelsMain;
    private LayoutInflater layoutInflater;
    private Context context;

    @Override
    public int getCount() {
        return modelsMain.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    public Object instantiateItem(ViewGroup container, final int position){
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_main_gornji_i_donji,container,false);

        ImageView imageMainGore,imageMainDolje;
        TextView titleMainGore,titleMainDolje,descMainGore,descMainDolje;

        imageMainGore = view.findViewById(R.id.imageAkcijaGore);
        imageMainDolje = view.findViewById(R.id.imageAkcijaDonji);

        titleMainGore = view.findViewById(R.id.opisAkcijaGore);
        titleMainDolje = view.findViewById(R.id.opisAkcijaDonji);

        descMainGore = view.findViewById(R.id.cijenaAkcijaGore);
        descMainDolje = view.findViewById(R.id.cijenaAkcijaDonji);

        imageMainGore.setImageResource(modelsMain.get(position).getImageMainGore());
        imageMainDolje.setImageResource(modelsMain.get(position).getImageMainDolje());

        titleMainGore.setText(modelsMain.get(position).getTitleMainGore());
        titleMainDolje.setText(modelsMain.get(position).getTitleMainDolje());

        descMainGore.setText(modelsMain.get(position).getDescMainGore());
        descMainDolje.setText(modelsMain.get(position).getDescMainDolje());

        container.addView(view,0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }

}
