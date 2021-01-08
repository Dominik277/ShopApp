package fishing.tackle.shop.ui.stapovi;

import androidx.appcompat.app.AppCompatActivity;
import fishing.tackle.shop.MainActivity;
import fishing.tackle.shop.R;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class StapoviKupnjaActivity extends AppCompatActivity {

    TextView textViewArtiklRacun2;
    TextView textViewCijenaRacun2;
    TextView textViewImeRacun2;
    TextView textViewPrezimeRacun2;
    TextView textViewAdresaRacun2;
    TextView textViewEmailRacun2;
    TextView textViewBrojRacun2;
    Button gumbPotvrdiKupnju;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stapovi_kupnja);

        textViewArtiklRacun2 = findViewById(R.id.textViewArtiklRacun2);
        textViewCijenaRacun2 = findViewById(R.id.textViewCijenaRacun2);
        textViewImeRacun2 = findViewById(R.id.textViewImeRacun2);
        textViewPrezimeRacun2 = findViewById(R.id.textViewPrezimeRacun2);
        textViewAdresaRacun2 = findViewById(R.id.textViewAdresaRacun2);
        textViewEmailRacun2 = findViewById(R.id.textViewEmailRacun2);
        textViewBrojRacun2 = findViewById(R.id.textViewBrojRacun2);
        gumbPotvrdiKupnju = findViewById(R.id.gumbPotvrdiKupnju);


        textViewImeRacun2.setText(getIntent().getStringExtra("ime"));
        textViewPrezimeRacun2.setText(getIntent().getStringExtra("prezime"));
        textViewAdresaRacun2.setText(getIntent().getStringExtra("adresa"));
        textViewEmailRacun2.setText(getIntent().getStringExtra("email"));
        textViewBrojRacun2.setText(getIntent().getStringExtra("broj"));


        gumbPotvrdiKupnju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StapoviKupnjaActivity.this,"Uspješno ste obavili kupnju!",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(StapoviKupnjaActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}