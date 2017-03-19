package com.numiracles.firetv.tvlogin;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;




public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void LoginWithAmazon(View view) {
        startActivity(new Intent(this, LWAActivity.class));
    }

    public void LoginWithEmail(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

}

