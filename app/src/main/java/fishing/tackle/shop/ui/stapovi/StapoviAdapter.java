package fishing.tackle.shop.ui.stapovi;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import fishing.tackle.shop.R;

public class StapoviAdapter extends PagerAdapter {

    private List<StapoviModel> modelsStapovi;
    private LayoutInflater layoutInflater;
    private Context context;

    public StapoviAdapter(List<StapoviModel> modelsStapovi, Context context){
        this.modelsStapovi = modelsStapovi;
        this.context = context;
    }

    @Override
    public int getCount() {
        return modelsStapovi.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    public Object instantiateItem(ViewGroup container, final int position){
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_stapovi,container,false);

        ImageView imageView;
        TextView title,desc,price;

        imageView = view.findViewById(R.id.imageStapovi);
        title = view.findViewById(R.id.titleStapovi);
        price = view.findViewById(R.id.priceStapovi);
        desc = view.findViewById(R.id.descStapovi);

        imageView.setImageResource(modelsStapovi.get(position).getImageStapovi());
        title.setText(modelsStapovi.get(position).getTitleStapovi());
        price.setText(modelsStapovi.get(position).getPriceStapovi());
        desc.setText(modelsStapovi.get(position).getDescStapovi());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, StapoviDetailActivity.class);
                intent.putExtra("ime_artikla", modelsStapovi.get(position).getTitleStapovi());
                intent.putExtra("iznos_cijene",modelsStapovi.get(position).getPriceStapovi());
                context.startActivity(intent);
            }
        });
        container.addView(view,0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }

}
