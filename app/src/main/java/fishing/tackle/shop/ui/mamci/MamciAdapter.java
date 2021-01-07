package fishing.tackle.shop.ui.mamci;

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

public class MamciAdapter extends PagerAdapter {

    private List<MamciModel> mamciModels;
    private LayoutInflater layoutInflater;
    private Context context;

    public MamciAdapter(List<MamciModel> mamciModels, Context context) {
        this.mamciModels = mamciModels;
        this.context = context;
    }

    @Override
    public int getCount() {
        return mamciModels.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_mamci, container, false);

        ImageView imageView;
        TextView title, desc;

        imageView = view.findViewById(R.id.image);
        title = view.findViewById(R.id.title);
        desc = view.findViewById(R.id.desc);

        imageView.setImageResource(mamciModels.get(position).getImage());
        title.setText(mamciModels.get(position).getTitle());
        desc.setText(mamciModels.get(position).getDesc());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MamciDetailActivity.class);
                intent.putExtra("param", mamciModels.get(position).getTitle());
                context.startActivity(intent);
                // finish();
            }
        });

        container.addView(view, 0);
        return view;
    }

}
