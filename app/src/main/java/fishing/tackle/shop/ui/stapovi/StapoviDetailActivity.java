package fishing.tackle.shop.ui.stapovi;

import androidx.appcompat.app.AppCompatActivity;
import fishing.tackle.shop.R;

import android.os.Bundle;
import android.widget.TextView;

public class StapoviDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_stapovi);

        TextView textView = findViewById(R.id.textViewStapovi);
        textView.setText(getIntent().getStringExtra("param"));
    }
}