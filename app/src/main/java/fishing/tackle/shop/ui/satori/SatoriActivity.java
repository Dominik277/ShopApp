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
        satoriModels.add(new SatoriModel(R.drawable.sticker, "Nash Titan Brolly", "Vrlo čvrsti šator namjenjen za jednu osobu"));
        satoriModels.add(new SatoriModel(R.drawable.sticker, "Fox Royale Bivy", "Vrlo čvrsti šator namjenjen za jednu osobu"));
        satoriModels.add(new SatoriModel(R.drawable.poster, "Prologic Commander", "Vrlo čvrsti šator namjenjen za jednu osobu"));
        satoriModels.add(new SatoriModel(R.drawable.namecard, "Chub Cyfish", "Vrlo čvrsti šator namjenjen za jednu osobu"));
        satoriModels.add(new SatoriModel(R.drawable.sticker, "Fox Easy Dome", "Vrlo čvrsti šator namjenjen za jednu osobu"));
        satoriModels.add(new SatoriModel(R.drawable.sticker, "Nash Double Top", "Vrlo čvrsti šator namjenjen za jednu osobu"));
        satoriModels.add(new SatoriModel(R.drawable.poster, "Fox Ultra Camo Brolly", "Vrlo čvrsti šator namjenjen za jednu osobu"));
        satoriModels.add(new SatoriModel(R.drawable.namecard, "JRC Defender Brolly", "Vrlo čvrsti šator namjenjen za jednu osobu"));

        satoriAdapter = new SatoriAdapter(satoriModels, this);

        viewPagerSatori = findViewById(R.id.viewPagerSatori);
        viewPagerSatori.setAdapter(satoriAdapter);
        viewPagerSatori.setPadding(130, 0, 130, 0);

    }

}