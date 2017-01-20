package com.example.alexandrup.androidanimations;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FrameAnimation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);
    }


    public void startFrameAnimation(View view) {
        ImageView dummyFrame = (ImageView) findViewById(R.id.imageFrame);

        dummyFrame.setBackgroundResource(R.drawable.frame);

        AnimationDrawable frameAnimation = (AnimationDrawable) dummyFrame.getBackground();

        if (frameAnimation.isRunning()) {
            frameAnimation.stop();
        } else {
            frameAnimation.stop();
            frameAnimation.start();
        }


    }
}
