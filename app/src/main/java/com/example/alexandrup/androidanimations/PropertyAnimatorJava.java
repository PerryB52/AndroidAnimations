package com.example.alexandrup.androidanimations;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class PropertyAnimatorJava extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_animator_java);

        imageView = (ImageView) findViewById(R.id.jvvimage);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PropertyAnimatorJava.this, "clicked" , Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void rotateAnimation(View view) {

        ObjectAnimator anim = ObjectAnimator.ofFloat(imageView, "rotation", 0.0f, 360.0f);
        anim.setDuration(500);
        anim.start();

    }

    public void scaleAnimation(View view) {

        ObjectAnimator anim = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 2.0f);
        anim.setDuration(500);
        anim.start();

    }

    public void translateAnimation(View view) {

        ObjectAnimator anim = ObjectAnimator.ofFloat(imageView, "translationX", 0f, 80f);
        anim.setDuration(500);
        anim.start();

    }

    public void alphaAnimation(View view) {

        ObjectAnimator anim = ObjectAnimator.ofFloat(imageView, "alpha", 1.0f, 0.0f);
        anim.setDuration(500);
        anim.start();

    }

    public void setAnimation(View view) {

        //Parent
        AnimatorSet rootSet = new AnimatorSet();

        //child 1
        ObjectAnimator rotate = ObjectAnimator.ofFloat(imageView, "rotation", 0.0f, 360.0f);
        rootSet.setDuration(500);

        //child 2
        AnimatorSet childSet = new AnimatorSet();

        ObjectAnimator scaleX = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 2.0f);
        scaleX.setDuration(300);

        ObjectAnimator scaleY = ObjectAnimator.ofFloat(imageView, "scaleY", 1.0f, 2.0f);
        scaleY.setDuration(300);

        rootSet.play(rotate).before(childSet);
        childSet.play(scaleX).with(scaleY);

        rootSet.start();

    }
}
