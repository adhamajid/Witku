package com.iddwitku.witku.navDrawer;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.iddwitku.witku.R;

public class Timbangan extends AppCompatActivity {

    public EditText g;
    public Button hit;
    public TextView has;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timbangan);

        g = (EditText) findViewById(R.id.input);
        hit = (Button) findViewById(R.id.button);
        has = (TextView) findViewById(R.id.hasil);


        hit.setOnClickListener((v) -> {
            if (g.length()==0){
                Toast.makeText(getApplicationContext(), "belum diisi", Toast.LENGTH_SHORT).show();
            } else{
                String inputanangka = g.getText().toString();
                double g = Double.parseDouble(inputanangka);
                double hs = Water(g);
                double asli = Asli(g);
                String output = hs + "\n" + g;
                has.setText(output);
            }
        });
    }
    public double Water(double g){return g*125;}

    public double Asli(double g){return g;}
}