package com.iddwitku.witku.Herbal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.iddwitku.witku.Benefits.BjambuBiji;

import com.iddwitku.witku.R;

public class Hdiare extends AppCompatActivity {

    ImageView jambu;
    ImageView kayu;
    ImageView salam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hdiare);

        jambu=findViewById(R.id.Jambu);
        kayu=findViewById(R.id.KayuSec);
        salam=findViewById(R.id.Salam);

        jambu.setOnClickListener(view -> {startActivity(new Intent(Hdiare.this , BjambuBiji.class));});
        kayu.setOnClickListener(view -> {startActivity(new Intent(Hdiare.this , HkayuSec.class));});
        salam.setOnClickListener(view -> {startActivity(new Intent(Hdiare.this , Hsalam.class));});
    }
}