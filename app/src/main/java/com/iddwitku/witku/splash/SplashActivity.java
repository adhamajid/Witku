package com.iddwitku.witku.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.iddwitku.witku.login.LoginActivity;
import com.iddwitku.witku.MainActivity;
import com.iddwitku.witku.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SplashActivity extends AppCompatActivity {

    private TextView labelTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();

        labelTextView = findViewById(R.id.label_text_view);
        new Handler().postDelayed(() -> {
            labelTextView.setVisibility(View.VISIBLE);
            RunTextViewAnimation();
        },1000);
        new Handler().postDelayed(() -> {
            if(firebaseUser != null && firebaseUser.isEmailVerified()){
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
            else {
                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                finish();
            }
        },3000);
    }

    private void RunTextViewAnimation() {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.splash_text_show);
        animation.reset();

        labelTextView.clearAnimation();
        labelTextView.startAnimation(animation);
    }
}
