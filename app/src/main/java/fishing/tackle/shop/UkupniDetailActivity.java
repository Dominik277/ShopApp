package fishing.tackle.shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UkupniDetailActivity extends AppCompatActivity {

    TextView textViewImeArtikla;
    TextView textViewIznosCijene;
    Button gumbKupi;
    EditText editTextIme;
    EditText editTextPrezime;
    EditText editTextAdresa;
    EditText editTextEmail;
    EditText editTextBroj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_ukupni);

        textViewImeArtikla = findViewById(R.id.textViewImeArtikla);
        textViewIznosCijene = findViewById(R.id.textViewIznosCijene);
        gumbKupi = findViewById(R.id.gumbKupi);
        editTextIme = findViewById(R.id.editTextIme);
        editTextPrezime = findViewById(R.id.editTextPrezime);
        editTextAdresa = findViewById(R.id.editTextAdresa);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextBroj = findViewById(R.id.editTextBroj);

        String imeArtikla = getIntent().getStringExtra("ime_artikla").toString();
        String iznosCijen = getIntent().getStringExtra("iznos_cijene").toString();

        textViewImeArtikla.setText(getIntent().getStringExtra("ime_artikla"));
        textViewIznosCijene.setText(getIntent().getStringExtra("iznos_cijene"));

        gumbKupi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UkupniDetailActivity.this, UkupniRacunActivity.class);
                String ime = editTextIme.getText().toString();
                String prezime = editTextPrezime.getText().toString();
                String adresa = editTextAdresa.getText().toString();
                String email = editTextEmail.getText().toString();
                String broj = editTextBroj.getText().toString();
                intent.putExtra("ime",ime);
                intent.putExtra("prezime",prezime);
                intent.putExtra("adresa",adresa);
                intent.putExtra("email",email);
                intent.putExtra("broj",broj);
                intent.putExtra("imeArtikla",imeArtikla);
                intent.putExtra("iznosCijene",iznosCijen);
                startActivity(intent);
                finish();
            }
        });

    }
}