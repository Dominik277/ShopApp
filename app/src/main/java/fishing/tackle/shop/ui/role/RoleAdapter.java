package fishing.tackle.shop.ui.role;

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

public class RoleAdapter extends PagerAdapter {

    private List<RoleModel> roleModels;
    private LayoutInflater layoutInflater;
    private Context context;

    public RoleAdapter(List<RoleModel> roleModels,Context context){
        this.roleModels = roleModels;
        this.context = context;
    }

    @Override
    public int getCount() {
        return roleModels.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position){
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_role,container,false);

        ImageView imageView;
        TextView title;
        TextView desc;

        imageView = view.findViewById(R.id.imageRole);
        title = view.findViewById(R.id.titleRole);
        desc = view.findViewById(R.id.descRole);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,RoleDetailActivity.class);
                intent.putExtra("param",roleModels.get(position).getTitle());
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
