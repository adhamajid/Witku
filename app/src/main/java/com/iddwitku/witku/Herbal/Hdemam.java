package com.iddwitku.witku.Herbal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.iddwitku.witku.Benefits.BjambuBiji;
import com.iddwitku.witku.Benefits.Bkunyit;
import com.iddwitku.witku.Benefits.Bsambiloto;
import com.iddwitku.witku.R;

public class Hdemam extends AppCompatActivity {

    ImageView sambiloto;
    ImageView temulawak;
    ImageView jambu;
    ImageView kunyit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hdemam);

        sambiloto=findViewById(R.id.Sambiloto);
        temulawak=findViewById(R.id.Temulawak);
        jambu=findViewById(R.id.Jambu);
        kunyit=findViewById(R.id.Kunyit);

        sambiloto.setOnClickListener(view -> {startActivity(new Intent(Hdemam.this , Bsambiloto.class));});

        temulawak.setOnClickListener(view -> {startActivity(new Intent(Hdemam.this , Htemulawak.class));});

        jambu.setOnClickListener(view -> {startActivity(new Intent(Hdemam.this , BjambuBiji.class));});

        kunyit.setOnClickListener(view -> {startActivity(new Intent(Hdemam.this , Bkunyit.class));});
    }
}