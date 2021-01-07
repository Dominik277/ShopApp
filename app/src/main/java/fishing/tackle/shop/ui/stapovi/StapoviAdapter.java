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

    private List<StapoviModel> models;
    private LayoutInflater layoutInflater;
    private Context context;

    public StapoviAdapter(List<StapoviModel> models, Context context){
        this.models = models;
        this.context = context;
    }

    @Override
    public int getCount() {
        return models.size();
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

        imageView = view.findViewById(R.id.image);
        title = view.findViewById(R.id.title);
        price = view.findViewById(R.id.price);
        desc = view.findViewById(R.id.desc);

        imageView.setImageResource(models.get(position).getImage());
        title.setText(models.get(position).getTitle());
        price.setText(models.get(position).getPrice());
        desc.setText(models.get(position).getDesc());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, StapoviDetailActivity.class);
                intent.putExtra("param",models.get(position).getTitle());
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
