package com.example.alexandrup.androidanimations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.Toast;

public class AnimationsByJava extends AppCompatActivity implements Animation.AnimationListener {

    private ImageView mImageView;

    private Animation mRotateAnim;
    private Animation mScaleAnim;
    private Animation mTranslateAnim;
    private Animation mAlphaAnim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animations_by_java);

        mImageView = (ImageView) findViewById(R.id.jvolleyball);

    }

    public void scaleAnimation(View view){

        mScaleAnim = new ScaleAnimation(
                1.0f, 1.5f,  // from x scale to x scale
                1.0f, 1.5f, // from Y scale to Y scale
                Animation.RELATIVE_TO_SELF, 0.5f, //pivot x
                Animation.RELATIVE_TO_SELF, 0.5f  //pivot y
        );

        mScaleAnim.setDuration(1000); //duration
        mScaleAnim.setAnimationListener(this);
        mImageView.startAnimation(mScaleAnim);


    }

    public void translateAnimation(View view){

        mTranslateAnim = new TranslateAnimation(
                Animation.ABSOLUTE, 0.0f, //from x delta
                Animation.ABSOLUTE, 150f, //to x delta
                Animation.ABSOLUTE, 0.0f, //from y delta
                Animation.ABSOLUTE, 0.0f  //to y delta
        );

        mTranslateAnim.setDuration(1000);
        mTranslateAnim.setAnimationListener(this);
        mImageView.startAnimation(mTranslateAnim);

    }

    public void alphaAnimation(View view){

        mAlphaAnim = new AlphaAnimation(1.0f, 0.0f); //from alpha to alpha

        mAlphaAnim.setDuration(1000);
        mAlphaAnim.setAnimationListener(this);
        mImageView.startAnimation(mAlphaAnim);

    }

    public void rotateAnimation(View view){
        mRotateAnim = new RotateAnimation(
                0.0f, -180f, //from x degress to x degress
                Animation.RELATIVE_TO_SELF, 0.5f, //pivot x
                Animation.RELATIVE_TO_SELF, 0.5f  //pivot y
        );

        mRotateAnim.setDuration(1000);
        mRotateAnim.setRepeatMode(Animation.REVERSE);
        mRotateAnim.setRepeatCount(1);
        mRotateAnim.setAnimationListener(this);
        mImageView.startAnimation(mRotateAnim);

    }


    @Override
    public void onAnimationStart(Animation animation) {

        if(animation == mScaleAnim){
            Toast.makeText(AnimationsByJava.this, "Scale animation started", Toast.LENGTH_SHORT).show();
        }

        if(animation == mRotateAnim){
            Toast.makeText(AnimationsByJava.this, "Rotate animation started", Toast.LENGTH_SHORT).show();
        }

        if(animation == mTranslateAnim){
            Toast.makeText(AnimationsByJava.this, "Translate animation started", Toast.LENGTH_SHORT).show();
        }

        if(animation == mAlphaAnim){
            Toast.makeText(AnimationsByJava.this, "Alpha animation started", Toast.LENGTH_SHORT).show();
        }


    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Toast.makeText(AnimationsByJava.this, "Animation Ended", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {
        Toast.makeText(AnimationsByJava.this, "Animation repeated", Toast.LENGTH_SHORT).show();
    }
}
