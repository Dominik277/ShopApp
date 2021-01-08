package fishing.tackle.shop.ui.satori;

import androidx.appcompat.app.AppCompatActivity;
import fishing.tackle.shop.R;

import android.os.Bundle;
import android.widget.TextView;

public class SatoriDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_satori);

        TextView textView = findViewById(R.id.textViewSatori);
        textView.setText(getIntent().getStringExtra("param"));
    }
}