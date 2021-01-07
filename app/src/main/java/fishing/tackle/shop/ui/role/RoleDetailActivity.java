package fishing.tackle.shop.ui.role;

import androidx.appcompat.app.AppCompatActivity;
import fishing.tackle.shop.R;

import android.os.Bundle;
import android.widget.TextView;

public class RoleDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_role);

        TextView textView = findViewById(R.id.textViewRole);
        textView.setText(getIntent().getStringExtra("param"));
    }
}