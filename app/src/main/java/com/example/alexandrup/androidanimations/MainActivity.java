package com.example.alexandrup.androidanimations;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {
    private ImageView mImageView;

    private Animation mRotateAnim;
    private Animation mScaleAnim;
    private Animation mTranslateAnim;
    private Animation mAlphaAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = (ImageView) findViewById(R.id.volleyball);
    }


    public void scaleAnimation(View view) {

        mScaleAnim = AnimationUtils.loadAnimation(this, R.anim.scale_anim);
        mScaleAnim.setAnimationListener(this);
        mImageView.startAnimation(mScaleAnim);
    }

    public void translateAnimation(View view) {

        mTranslateAnim = AnimationUtils.loadAnimation(this, R.anim.translate_anim);
        mTranslateAnim.setAnimationListener(this);
        mImageView.startAnimation(mTranslateAnim);
    }

    public void alphaAnimation(View view) {
        mAlphaAnim = AnimationUtils.loadAnimation(this, R.anim.alpha_anim);
        mAlphaAnim.setAnimationListener(this);
        mImageView.startAnimation(mAlphaAnim);
    }

    public void rotateAnimation(View view) {

        mRotateAnim = AnimationUtils.loadAnimation(this, R.anim.rotate_anim);
        mRotateAnim.setAnimationListener(this);
        mImageView.startAnimation(mRotateAnim);
    }


    @Override
    public void onAnimationStart(Animation animation) {

        Toast.makeText(MainActivity.this, "Animation Started", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAnimationEnd(Animation animation) {

        Toast.makeText(MainActivity.this, "Animation Ended", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

        Toast.makeText(MainActivity.this, "Animation Repeated", Toast.LENGTH_SHORT).show();
    }

    public void goToJavaActiv(View view) {

        Intent i = new Intent(MainActivity.this, AnimationsByJava.class);
        startActivity(i);

    }

    public void goToFrameAnim(View view) {

        Intent i = new Intent(MainActivity.this, FrameAnimation.class);
        startActivity(i);

    }
}