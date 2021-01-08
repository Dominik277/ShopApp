package fishing.tackle.shop.ui.satori;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import fishing.tackle.shop.R;

public class SatoriActivity extends AppCompatActivity {

    ViewPager viewPagerSatori;
    SatoriAdapter satoriAdapter;
    List<SatoriModel> satoriModels;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satori);

        satoriModels = new ArrayList<>();
        satoriModels.add(new SatoriModel(R.drawable.nashtitan, "Nash Titan Brolly", "Vrlo čvrsti šator namjenjen za jednu osobu"));
        satoriModels.add(new SatoriModel(R.drawable.foxroyale, "Fox Royale Bivy", "Vrlo čvrsti šator namjenjen za jednu osobu"));
        satoriModels.add(new SatoriModel(R.drawable.prologiccommander, "Prologic Commander", "Vrlo čvrsti šator namjenjen za jednu osobu"));
        satoriModels.add(new SatoriModel(R.drawable.chubcyfish, "Chub Cyfish", "Vrlo čvrsti šator namjenjen za jednu osobu"));
        satoriModels.add(new SatoriModel(R.drawable.foxeasydome, "Fox Easy Dome", "Vrlo čvrsti šator namjenjen za jednu osobu"));
        satoriModels.add(new SatoriModel(R.drawable.nashdoubletop, "Nash Double Top", "Vrlo čvrsti šator namjenjen za jednu osobu"));
        satoriModels.add(new SatoriModel(R.drawable.foxbrolly, "Fox Ultra Camo Brolly", "Vrlo čvrsti šator namjenjen za jednu osobu"));
        satoriModels.add(new SatoriModel(R.drawable.jrcbrolly, "JRC Defender Brolly", "Vrlo čvrsti šator namjenjen za jednu osobu"));

        satoriAdapter = new SatoriAdapter(satoriModels, this);

        viewPagerSatori = findViewById(R.id.viewPagerSatori);
        viewPagerSatori.setAdapter(satoriAdapter);
        viewPagerSatori.setPadding(130, 0, 130, 0);

    }

}