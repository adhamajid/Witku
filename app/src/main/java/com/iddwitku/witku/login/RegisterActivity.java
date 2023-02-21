package com.iddwitku.witku.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.iddwitku.witku.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegisterActivity extends AppCompatActivity {

    private ImageButton kembali;
    private EditText email;
    private EditText password;
    private Button register;
    private Button masuk;

    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        kembali = (ImageButton) findViewById(R.id.btn_kembali);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        register = findViewById(R.id.register);
        masuk = findViewById(R.id.masuk);

        auth = FirebaseAuth.getInstance();

        kembali.setOnClickListener(view -> {
            startActivity(new Intent(RegisterActivity.this , LoginActivity.class));
            finish();
        });

        masuk.setOnClickListener(view -> {
            startActivity(new Intent(RegisterActivity.this , LoginActivity.class));
            finish();
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt_email = email.getText().toString();
                String txt_password = password.getText().toString();

                if (TextUtils.isEmpty(txt_email) || TextUtils.isEmpty(txt_password)){
                    Toast.makeText(RegisterActivity.this, "Empty credentials!", Toast.LENGTH_SHORT).show();
                }
                else if (txt_password.length() < 6){
                    Toast.makeText(RegisterActivity.this, "Password too short!" , Toast.LENGTH_SHORT).show();
                }
                else {
                    registerUser(txt_email , txt_password);
                }
            }

            private void registerUser(String email, String password) {

                auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(RegisterActivity.this , new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){

                            // send verification email


                            FirebaseUser user = auth.getCurrentUser();
                            user.sendEmailVerification().addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void unused) {
                                    register.setEnabled(true);

                                    Toast.makeText(RegisterActivity.this , "Verification Email sent to : " + FirebaseAuth.getInstance().getCurrentUser().getEmail(), Toast.LENGTH_SHORT).show();
                                    startActivity(new Intent(RegisterActivity.this , LoginActivity.class));
                                    finish();
                                }
                            }).addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    Toast.makeText(RegisterActivity.this , "Email not sent !" , Toast.LENGTH_SHORT).show();
                                }
                            });

                        } else {
                            Toast.makeText(RegisterActivity.this , "The Email address is already in use by another account." , Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

    }
}