package fishing.tackle.shop.ui.satori;

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
import fishing.tackle.shop.UkupniDetailActivity;

public class SatoriAdapter extends PagerAdapter {

    private List<SatoriModel> satoriModels;
    private LayoutInflater layoutInflater;
    private Context context;

    public SatoriAdapter(List<SatoriModel> satoriModels, Context context) {
        this.satoriModels = satoriModels;
        this.context = context;
    }

    @Override
    public int getCount() {
        return satoriModels.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_satori, container, false);

        ImageView imageView;
        TextView title, desc;

        imageView = view.findViewById(R.id.imageSatori);
        title = view.findViewById(R.id.titleSatori);
        desc = view.findViewById(R.id.descSatori);

        imageView.setImageResource(satoriModels.get(position).getImageSatori());
        title.setText(satoriModels.get(position).getTitleSatori());
        desc.setText(satoriModels.get(position).getCijenaSatori());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, UkupniDetailActivity.class);
                intent.putExtra("ime_artikla", satoriModels.get(position).getTitleSatori());
                intent.putExtra("iznos_cijene",satoriModels.get(position).getCijenaSatori());
                context.startActivity(intent);
                // finish();
            }
        });

        container.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }

}
