package fishing.tackle.shop.ui.satori;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import fishing.tackle.shop.R;

public class SatoriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satori);

        getSupportActionBar().setTitle("Satori");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}