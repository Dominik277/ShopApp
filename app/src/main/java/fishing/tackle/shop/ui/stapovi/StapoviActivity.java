package fishing.tackle.shop.ui.stapovi;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import fishing.tackle.shop.R;

public class StapoviActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stapovi);

        getSupportActionBar().setTitle("Stapovi");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}