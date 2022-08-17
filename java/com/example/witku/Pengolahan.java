package com.example.witku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class Pengolahan extends AppCompatActivity implements View.OnClickListener {

    DrawerLayout drawerLayout;
    private Button startBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengolahan);

        drawerLayout = findViewById(R.id.drawer_layout);

        Button button1 = findViewById(R.id.demam);
        Button button2 = findViewById(R.id.letihlesu);
        Button button3 = findViewById(R.id.mencret);
        Button button4 = findViewById(R.id.mimisan);
        Button button5 = findViewById(R.id.mual);
        Button button6 = findViewById(R.id.panasdalam);
        Button button7 = findViewById(R.id.sakitkepalasebelah);
        Button button8 = findViewById(R.id.sakittenggorokan);
        Button button9 = findViewById(R.id.imun);
        Button button10 = findViewById(R.id.pinggang);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
    }

    public void ClickMenu(View view){ com.example.witku.MainActivity.openDrawer(drawerLayout); }

    public void ClickLogo(View view){
        com.example.witku.MainActivity.closeDrawer(drawerLayout);
    }

    public void ClickHome(View view){ com.example.witku.MainActivity.redirectActivity(this,
            com.example.witku.MainActivity.class); }

    public void ClickInformasi(View view){
        com.example.witku.MainActivity.redirectActivity(this,Informasi.class);
    }
    public void ClickPengolahan(View view){ recreate(); }

    public void ClickAboutUs(View view){
        com.example.witku.MainActivity.redirectActivity(this,AboutUs.class);
    }

    public void ClickLogout(View view){
        com.example.witku.MainActivity.Logout(this);
    }

    @Override
    public void onPause() {
        super.onPause();

        com.example.witku.MainActivity.closeDrawer(drawerLayout);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.demam:
                Intent categoryIntent = new Intent(Pengolahan.this,Demam.class);
                startActivity(categoryIntent);
                finish();
                break;

            case R.id.imun:
                Intent categoryIntent1 = new Intent(Pengolahan.this,PeningkatImun.class);
                startActivity(categoryIntent1);
                finish();
                break;

            case R.id.letihlesu:
                Intent categoryIntent2 = new Intent(Pengolahan.this,LetihLesu.class);
                startActivity(categoryIntent2);
                finish();
                break;

            case R.id.mencret:
                Intent categoryIntent3 = new Intent(Pengolahan.this,Mencret.class);
                startActivity(categoryIntent3);
                finish();
                break;

            case R.id.mimisan:
                Intent categoryIntent4 = new Intent(Pengolahan.this,Mimisan.class);
                startActivity(categoryIntent4);
                finish();
                break;

            case R.id.mual:
                Intent categoryIntent5 = new Intent(Pengolahan.this,Mual.class);
                startActivity(categoryIntent5);
                finish();
                break;

            case R.id.pinggang:
                Intent categoryIntent6 = new Intent(Pengolahan.this,SakitPinggang.class);
                startActivity(categoryIntent6);
                finish();
                break;

            case R.id.panasdalam:
                Intent categoryIntent7 = new Intent(Pengolahan.this,PanasDalam.class);
                startActivity(categoryIntent7);
                finish();
                break;

            case R.id.sakitkepalasebelah:
                Intent categoryIntent8 = new Intent(Pengolahan.this,SakitKepalaSebelah.class);
                startActivity(categoryIntent8);
                finish();
                break;

            case R.id.sakittenggorokan:
                Intent categoryIntent9 = new Intent(Pengolahan.this,SakitTenggorokan.class);
                startActivity(categoryIntent9);
                finish();
                break;
        }
    }
}