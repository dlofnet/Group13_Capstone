package com.example.group13_capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class Hatched extends AppCompatActivity implements View.OnClickListener{

    ImageView imgFeed, imgSideBar, imgQuest, imgSteps;
    Dialog qDialog;
    BottomSheetDialog sDialog, fDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_hatched);

        imgFeed = findViewById(R.id.imgFeed);
        imgSideBar = findViewById(R.id.imgSideBar);
        imgQuest = findViewById(R.id.imgQuest);
        imgSteps = findViewById(R.id.imgSteps);

        imgFeed.setOnClickListener(this);
        imgSideBar.setOnClickListener(this);
        imgQuest.setOnClickListener(this);
        imgSteps.setOnClickListener(this);

        qDialog = new Dialog(this);
        sDialog = new BottomSheetDialog(this);
        fDialog = new BottomSheetDialog(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imgFeed:
                fDialog.setContentView(R.layout.feed_popup);
                fDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                fDialog.show();
                break;
            case R.id.imgSideBar:
                break;
            case R.id.imgQuest:
                qDialog.setContentView(R.layout.quest_popup);
                qDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                qDialog.show();
                break;
            case R.id.imgSteps:
                sDialog.setContentView(R.layout.steps_popup);
                sDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                sDialog.show();
        }
    }
}