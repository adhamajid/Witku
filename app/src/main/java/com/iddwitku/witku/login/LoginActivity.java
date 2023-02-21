package com.iddwitku.witku.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.iddwitku.witku.MainActivity;
import com.iddwitku.witku.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {


    private EditText email;
    private EditText password;
    private Button login;
    private Button sign;

    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        sign = findViewById(R.id.btn_signUp);

        auth = FirebaseAuth.getInstance();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt_email = email.getText().toString();
                String txt_password = password.getText().toString();
                loginUser(txt_email, txt_password);

                FirebaseUser currentUser = auth.getCurrentUser();
                if (currentUser != null) {
                }
            }
        });

        sign.setOnClickListener(view -> {
            startActivity(new Intent(LoginActivity.this , RegisterActivity.class));
        });

    }
    private void loginUser(String email, String password) {

        auth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (!task.isSuccessful()) {
                    // Sign in success, update UI with the signed-in user's information
                    Toast.makeText(LoginActivity.this, "Please register yourself", Toast.LENGTH_SHORT).show();
                    //FirebaseUser user = auth.getCurrentUser();
                    //startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    //finish();
                } else {
                    // If sign in fails, display a message to the user.
                    checkIfEmailVerified();
                }
            }
        });


    }

    private void checkIfEmailVerified() {
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        if (user.isEmailVerified()) {
            // user is verified, so you can finish this activity or send user to activity which you want.
            Toast.makeText(LoginActivity.this, "Successfully logged in", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            finish();

        } else {
            // email is not verified, so just prompt the message to the user and restart this activity.
            // NOTE: don't forget to log out the user.
            Toast.makeText(LoginActivity.this, "Please provide your email for confirmation", Toast.LENGTH_SHORT).show();
            FirebaseAuth.getInstance().signOut();

            //restart this activity
        }
    }
}