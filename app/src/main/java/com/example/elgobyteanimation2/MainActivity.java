package com.example.elgobyteanimation2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView object;
    Animation anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        object = (ImageView) findViewById(R.id.object);

        Log.e("myTag","testing git");


    }

    public void fadeInAnim(View view) {
        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_fade_in);
        object.startAnimation(anim);
    }

    public void fadeOutAnim(View view) {
        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_fade_out);
        object.startAnimation(anim);
    }

    public void bounce(View view) {
        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_bounce);
        object.startAnimation(anim);
    }

    public void blink(View view) {
        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_blink);
        object.startAnimation(anim);
    }

    public void move(View view) {
        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_move);
        object.startAnimation(anim);
    }

    public void rotate(View view) {
        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_rotate);
        object.startAnimation(anim);
    }

    public void slideBottom(View view) {
        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_slide_bottom);
        object.startAnimation(anim);
    }

    public void slideUp(View view) {
        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_slide_up);
        object.startAnimation(anim);
    }

    public void slideLeft(View view) {
        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_slide_left);
        object.startAnimation(anim);
    }

    public void slideRight(View view) {
        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_slide_right);
        object.startAnimation(anim);
    }

    public void zoomIn(View view) {
        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_zoom_in);
        object.startAnimation(anim);
    }

    public void zoomOut(View view) {
        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_zoom_out);
        object.startAnimation(anim);
    }
}
