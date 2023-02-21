package com.iddwitku.witku;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.iddwitku.witku.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.firebase.auth.FirebaseAuth;
import com.iddwitku.witku.Benefits.Badas;
import com.iddwitku.witku.Benefits.Balang;
import com.iddwitku.witku.Benefits.BjambuBiji;
import com.iddwitku.witku.Benefits.Bkunyit;
import com.iddwitku.witku.Benefits.Bmengkudu;
import com.iddwitku.witku.Benefits.Bsambiloto;
import com.iddwitku.witku.Benefits.Bsirih;
import com.iddwitku.witku.General.Gattention;
import com.iddwitku.witku.General.Gchoosing;
import com.iddwitku.witku.General.Gdefinition;
import com.iddwitku.witku.General.Gguide;
import com.iddwitku.witku.General.Gjamu;
import com.iddwitku.witku.General.Gtoga;
import com.iddwitku.witku.General.Gtools;
import com.iddwitku.witku.Herbal.Hbatuk;
import com.iddwitku.witku.Herbal.Hdemam;
import com.iddwitku.witku.Herbal.Hdiare;
import com.iddwitku.witku.Herbal.Hinfluenza;
import com.iddwitku.witku.Herbal.HmasukAngin;
import com.iddwitku.witku.Herbal.Hmimisan;
import com.iddwitku.witku.Herbal.Hsariawan;
import com.iddwitku.witku.Imun.Ijahe;
import com.iddwitku.witku.Imun.Ikapulaga;
import com.iddwitku.witku.Imun.Isereh;
import com.iddwitku.witku.login.LoginActivity;
import com.iddwitku.witku.navDrawer.About;
import com.iddwitku.witku.navDrawer.Konsul;
import com.iddwitku.witku.navDrawer.Timbangan;
import com.iddwitku.witku.slider.SliderAdapter;
import com.iddwitku.witku.slider.SliderItem;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private AdView mAdView;

    DrawerLayout drawerLayout;

    //General Information
    ImageView imageView;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;

    //Benefits of Plants
    ImageView benefits;
    ImageView benefits1;
    ImageView benefits2;
    ImageView benefits3;
    ImageView benefits4;
    ImageView benefits5;
    ImageView benefits6;

    //Herbal Treatment
    ImageView herbal;
    ImageView herbal1;
    ImageView herbal2;
    ImageView herbal3;
    ImageView herbal4;
    ImageView herbal5;
    ImageView herbal6;

    //Imunomodulator
    ImageView imun;
    ImageView imun1;
    ImageView imun2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        //General Information
        imageView=findViewById(R.id.G_Definition);
        imageView1=findViewById(R.id.G_Jamu);
        imageView2=findViewById(R.id.G_choosing);
        imageView3=findViewById(R.id.G_Tools);
        imageView4=findViewById(R.id.G_Toga);
        imageView5=findViewById(R.id.G_guide);
        imageView6=findViewById(R.id.G_Attention);


        //General Information
        imageView.setOnClickListener(view -> {startActivity(new Intent(MainActivity.this , Gdefinition.class));});

        imageView1.setOnClickListener(view -> {startActivity(new Intent(MainActivity.this , Gjamu.class));});

        imageView2.setOnClickListener(view -> {startActivity(new Intent(MainActivity.this , Gchoosing.class));});

        imageView3.setOnClickListener(view -> {startActivity(new Intent(MainActivity.this , Gtools.class));});

        imageView4.setOnClickListener(view -> {startActivity(new Intent(MainActivity.this , Gtoga.class));});

        imageView5.setOnClickListener(view -> {startActivity(new Intent(MainActivity.this , Gguide.class));});

        imageView6.setOnClickListener(view -> {startActivity(new Intent(MainActivity.this , Gattention.class));});

        //Benefits of Plants
        benefits=findViewById(R.id.Kunyit);
        benefits1=findViewById(R.id.Sambiloto);
        benefits2=findViewById(R.id.Sirih);
        benefits3=findViewById(R.id.Alang);
        benefits4=findViewById(R.id.Mengkudu);
        benefits5=findViewById(R.id.J_biji);
        benefits6=findViewById(R.id.Adas);

        benefits.setOnClickListener(view -> {startActivity(new Intent(MainActivity.this , Bkunyit.class));});

        benefits1.setOnClickListener(view -> {startActivity(new Intent(MainActivity.this , Bsambiloto.class));});

        benefits2.setOnClickListener(view -> {startActivity(new Intent(MainActivity.this , Bsirih.class));});

        benefits3.setOnClickListener(view -> {startActivity(new Intent(MainActivity.this , Balang.class));});

        benefits4.setOnClickListener(view -> {startActivity(new Intent(MainActivity.this , Bmengkudu.class));});

        benefits5.setOnClickListener(view -> {startActivity(new Intent(MainActivity.this , BjambuBiji.class));});

        benefits6.setOnClickListener(view -> {startActivity(new Intent(MainActivity.this , Badas.class));});

        //Herbal Treatment
        herbal=findViewById(R.id.Demam);
        herbal1=findViewById(R.id.Batuk);
        herbal2=findViewById(R.id.Diare);
        herbal3=findViewById(R.id.Mimisan);
        herbal4=findViewById(R.id.Sariawan);
        herbal5=findViewById(R.id.Masuk_angin);
        herbal6=findViewById(R.id.Influenza);

        herbal.setOnClickListener(view -> {startActivity(new Intent(MainActivity.this, Hdemam.class));});

        herbal1.setOnClickListener(view -> {startActivity(new Intent(MainActivity.this, Hbatuk.class));});

        herbal2.setOnClickListener(view -> {startActivity(new Intent(MainActivity.this, Hdiare.class));});

        herbal3.setOnClickListener(view -> {startActivity(new Intent(MainActivity.this, Hmimisan.class));});

        herbal4.setOnClickListener(view -> {startActivity(new Intent(MainActivity.this, Hsariawan.class));});

        herbal5.setOnClickListener(view -> {startActivity(new Intent(MainActivity.this, HmasukAngin.class));});

        herbal6.setOnClickListener(view -> {startActivity(new Intent(MainActivity.this, Hinfluenza.class));});

        //Imunomodulator
        imun=findViewById(R.id.Jahe);
        imun1=findViewById(R.id.Sereh);
        imun2=findViewById(R.id.Kapulaga);

        imun.setOnClickListener(view -> {startActivity(new Intent(MainActivity.this, Ijahe.class));});

        imun1.setOnClickListener(view -> {startActivity(new Intent(MainActivity.this, Isereh.class));});

        imun2.setOnClickListener(view -> {startActivity(new Intent(MainActivity.this, Ikapulaga.class));});

        // we are creating array list for storing our image urls.
        ArrayList<SliderItem> sliderDataArrayList = new ArrayList<>();

        // initializing the slider view.
        SliderView sliderView = findViewById(R.id.slider);

        // adding the urls inside array list
        sliderDataArrayList.add(new SliderItem(R.drawable.utama2));
        sliderDataArrayList.add(new SliderItem(R.drawable.utama1));
        sliderDataArrayList.add(new SliderItem(R.drawable.utama));

        // passing this array list inside our adapter class.
        SliderAdapter adapter = new SliderAdapter(this, sliderDataArrayList);

        // below method is used to set auto cycle direction in left to
        // right direction you can change according to requirement.
        sliderView.setAutoCycleDirection(SliderView.LAYOUT_DIRECTION_LTR);

        // below method is used to
        // setadapter to sliderview.
        sliderView.setSliderAdapter(adapter);

        // below method is use to set
        // scroll time in seconds.
        sliderView.setScrollTimeInSec(3);

        // to set it scrollable automatically
        // we use below method.
        sliderView.setAutoCycle(true);

        // to start autocycle below method is used.
        sliderView.startAutoCycle();


        drawerLayout = findViewById(R.id.main);
    }

    public void ClickMenu(View view) {
        openDrawer(drawerLayout);
    }

    public static void openDrawer(DrawerLayout drawerLayout) {
        //Open drawer layout
        drawerLayout.openDrawer(GravityCompat.START);
    }


    public static void closeDrawer(DrawerLayout drawerLayout) {
        //close drawer layout
        //check condition
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            //when drawer is open
            //close drawer
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }

    public void ClickHome(View view) {
        //Recreate activity
        recreate();
    }

    public void ClickAbout(View view){
        redirectActivity(this, About.class);
    }
    public void ClickTimbangan(View view){
        redirectActivity(this, Timbangan.class);
    }

    public void ClickKonsul(View view){
        redirectActivity(this, Konsul.class);
    }

    public void ClickKeluar(View view){
        Keluar(this);
    }

    public void Keluar(final Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        builder.setTitle("Logout");

        builder.setMessage("Are you sure you want to leave?");

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Finish
                FirebaseAuth.getInstance().signOut();
                Toast.makeText(MainActivity.this, "Logged Out!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this , LoginActivity.class));
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();
            }
        });

        builder.show();
    }

    public static void redirectActivity(Activity activity, Class aClass) {
        //initialize intent
        Intent intent = new Intent(activity,aClass);

        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        activity.startActivity(intent);
    }

    @Override
    protected void onPause() {
        super.onPause();
        closeDrawer(drawerLayout);
    }
}