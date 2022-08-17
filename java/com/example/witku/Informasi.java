package com.example.witku;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class Informasi extends AppCompatActivity {

    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi);

        drawerLayout = findViewById(R.id.drawer_layout);
    }

    public void ClickMenu(View view){ com.example.witku.MainActivity.openDrawer(drawerLayout); }

    public void ClickLogo(View view){
        com.example.witku.MainActivity.closeDrawer(drawerLayout);
    }

    public void ClickHome(View view){ com.example.witku.MainActivity.redirectActivity(this,
            com.example.witku.MainActivity.class); }

    public void ClickInformasi(View view){ recreate(); }

    public void ClickPengolahan(View view){
        com.example.witku.MainActivity.redirectActivity(this,Pengolahan.class);
    }

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
}