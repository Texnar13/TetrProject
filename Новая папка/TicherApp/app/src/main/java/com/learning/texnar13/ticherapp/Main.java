package com.learning.texnar13.ticherapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.opengl.GLSurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.home_screen);
//        LinearLayout bPlans = (LinearLayout) findViewById(R.id.home_my_plans_clickable);
//        bPlans.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                setContentView(R.layout.classes_);
//            }
//        });
//
//        LinearLayout bClasses = (LinearLayout) findViewById(R.id.home_my_classes_clickable);
//        bClasses.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                setContentView(R.layout.classes_);
//            }
//        });


        LinearLayout linV = new LinearLayout(this);
        linV.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams paramsLinV = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

        LinearLayout linG = new LinearLayout(this);
        linG.setOrientation(LinearLayout.HORIZONTAL);
        linV.addView(linG, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

        LinearLayout linP = new LinearLayout(this);
        linP.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout.LayoutParams paramsLinP = new LinearLayout.LayoutParams(120,60);
        paramsLinP.rightMargin = 15;
        linG.addView(linP,paramsLinP);


        LinearLayout linP2 = new LinearLayout(this);
        linP2.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout.LayoutParams paramsLinP2 = new LinearLayout.LayoutParams(120,60);
        paramsLinP2.rightMargin = 15;

        linG.addView(linP2,paramsLinP2);

        Button b22 = new Button(this);
        b22.setText("1B");
        LinearLayout.LayoutParams buttonParams2 = new LinearLayout.LayoutParams(60,60);
        linP2.addView(b22,buttonParams2);

        Button b222 = new Button(this);
        b222.setText("2B");
        linP2.addView(b222,buttonParams2);




        Button b = new Button(this);
        b.setText("1B");
        LinearLayout.LayoutParams buttonParams = new LinearLayout.LayoutParams(60,60);
        linP.addView(b,buttonParams);

        Button b2 = new Button(this);
        b2.setText("2B");
        linP.addView(b2,buttonParams);






        setContentView(linV,paramsLinV);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }


}
