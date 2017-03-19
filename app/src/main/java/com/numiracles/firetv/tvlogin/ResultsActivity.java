package com.numiracles.firetv.tvlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    // TextView ResultsTextView = (TextView)findViewById(R.id.ResultsText1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
//        ResultsTextView.setText(message);

        TextView textView = new TextView(this);
        textView.setTextSize(24);
        textView.setText(message);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_results);
        layout.addView(textView);

    }

    public void LoginWithAmazon() {
        startActivity(new Intent(this, LWAActivity.class));
    }

}
