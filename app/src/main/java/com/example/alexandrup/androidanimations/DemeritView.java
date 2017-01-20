package com.example.alexandrup.androidanimations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.Toast;

public class DemeritView extends AppCompatActivity {

    ImageView mImageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demerit_view);

        mImageview = (ImageView) findViewById(R.id.dummyImageDD);

        mImageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(DemeritView.this, "Image Clicked", Toast.LENGTH_SHORT).show();

            }
        });

    }


    public void translateAnimation(View view){

        TranslateAnimation translateAnimation = new TranslateAnimation(
                Animation.ABSOLUTE, 0.0f,
                Animation.ABSOLUTE, 0.0f,
                Animation.ABSOLUTE, 0.0f,
                Animation.ABSOLUTE, 330.0f
                );

        translateAnimation.setDuration(1000);
        translateAnimation.setFillAfter(true);
        mImageview.startAnimation(translateAnimation);
    }
}
