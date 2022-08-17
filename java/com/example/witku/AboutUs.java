package com.example.witku;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class AboutUs extends AppCompatActivity {

    DrawerLayout drawerLayout;
/*    VideoView videoView;
    Button play;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

/*        videoView = (VideoView)findViewById(R.id.videoView);
        play = (Button)findViewById(R.id.play);*/

        drawerLayout = findViewById(R.id.drawer_layout);
    }

/*    public void VideoPlay(View view){
        Uri uri = Uri.parse("android.resource://" + getPackageName()+"/" +R.raw.video);
        videoView.setVideoURI(uri);
        videoView.start();
    }*/

    public void ClickMenu(View view){ MainActivity.openDrawer(drawerLayout); }

    public void ClickLogo(View view){
        MainActivity.closeDrawer(drawerLayout);
    }

    public void ClickHome(View view){ MainActivity.redirectActivity(this,MainActivity.class); }

    public void ClickInformasi(View view){ MainActivity.redirectActivity(this,Informasi.class); }

    public void ClickPengolahan(View view){ MainActivity.redirectActivity(this,Pengolahan.class);}

    public void ClickAboutUs(View view){
        recreate();
    }

    public void ClickLogout(View view){
        MainActivity.Logout(this);
    }

    @Override
    public void onPause() {
        super.onPause();

        MainActivity.closeDrawer(drawerLayout);
    }
}
