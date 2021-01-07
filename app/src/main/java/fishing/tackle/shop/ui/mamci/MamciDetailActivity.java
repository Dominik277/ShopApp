package fishing.tackle.shop.ui.mamci;

import androidx.appcompat.app.AppCompatActivity;
import fishing.tackle.shop.R;

import android.os.Bundle;
import android.widget.TextView;

public class MamciDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_mamci);

        TextView textView = findViewById(R.id.textViewMamci);
        textView.setText(getIntent().getStringExtra("param"));
    }
}