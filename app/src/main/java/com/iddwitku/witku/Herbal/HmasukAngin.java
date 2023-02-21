package com.iddwitku.witku.Herbal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.iddwitku.witku.R;

public class HmasukAngin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hmasuk_angin);

        ImageView ketumbar;
        ImageView ingu;

        ketumbar=findViewById(R.id.Ketumbar);
        ingu=findViewById(R.id.Ingu);


        ketumbar.setOnClickListener(view -> {startActivity(new Intent(HmasukAngin.this , Hketumbar.class));});
        ingu.setOnClickListener(view -> {startActivity(new Intent(HmasukAngin.this , Hingu.class));});

    }
}