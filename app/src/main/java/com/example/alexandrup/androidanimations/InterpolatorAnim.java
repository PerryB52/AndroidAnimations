package com.example.alexandrup.androidanimations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class InterpolatorAnim extends AppCompatActivity {

    private ImageView mImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interpolator_anim);

        mImageView = (ImageView) findViewById(R.id.dummyImageInterp);

    }
    public void interpolatorEg(View view) {

        Animation tvAnim = AnimationUtils.loadAnimation(this, R.anim.interpolator_anim);
        mImageView.startAnimation(tvAnim);



    }
}
