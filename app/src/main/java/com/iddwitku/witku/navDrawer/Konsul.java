package com.iddwitku.witku.navDrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.iddwitku.witku.R;

public class Konsul extends AppCompatActivity {

    ImageView endang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konsul);

        endang=findViewById(R.id.endang);

        endang.setClickable(true);

        endang.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent  = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://wa.me/6281802728630"));
                startActivity(intent);
            }
        });
    }
}