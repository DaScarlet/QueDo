package com.example.quedo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class HomeW extends AppCompatActivity {
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homew);

        Button loginBtn = (Button)findViewById(R.id.btnhomelogin);
        Button regBtn = (Button)findViewById(R.id.btncreateacc);

        ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.layoutLanding);
        AlphaAnimation animation = new AlphaAnimation(0.0f , 1.0f ) ;
        animation.setFillAfter(true);
        animation.setDuration(2400);
        layout.startAnimation(animation);

//        mAuth = FirebaseAuth.getInstance();
//
//        if(mAuth.getCurrentUser() != null) {
//            startActivity(new Intent(getApplicationContext(), Home.class));
//            finish();
//        }

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeW.this, userLogin.class));
            }
        });

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeW.this, SignUp.class));
            }
        });
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        HomeW.this.finish();
        System.exit(0);
    }
}