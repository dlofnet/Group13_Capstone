package com.example.group13_capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class Unhatched extends AppCompatActivity implements View.OnClickListener{

    ImageView hatch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_unhatched);

        hatch = findViewById(R.id.hatch);
        hatch.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.hatch:
                Intent i = new Intent(this, Hatched.class);
                startActivity(i);
                overridePendingTransition(R.anim.intent_fade_in, R.anim.intent_fade_out);
                break;
        }
    }
}