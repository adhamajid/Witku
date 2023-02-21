package com.iddwitku.witku.Herbal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.iddwitku.witku.Imun.Ikapulaga;
import com.iddwitku.witku.R;

public class Hinfluenza extends AppCompatActivity {

    ImageView kapulaga;
    ImageView gendola;
    ImageView ciplukan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hinfluenza);

        kapulaga=findViewById(R.id.Kapulaga);
        gendola=findViewById(R.id.Gendola);
        ciplukan=findViewById(R.id.Ciplukan);

        kapulaga.setOnClickListener(view -> {startActivity(new Intent(Hinfluenza.this , Ikapulaga.class));});
        gendola.setOnClickListener(view -> {startActivity(new Intent(Hinfluenza.this , Hgendola.class));});
        ciplukan.setOnClickListener(view -> {startActivity(new Intent(Hinfluenza.this , Hciplukan.class));});
    }
}