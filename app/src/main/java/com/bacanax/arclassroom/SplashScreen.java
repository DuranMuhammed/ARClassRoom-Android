package com.bacanax.arclassroom;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import com.airbnb.lottie.Lottie;
import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends AppCompatActivity {

    TextView firstTextSplash, secondTextSplash;
    LottieAnimationView lottie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        firstTextSplash = findViewById(R.id.firstsplash);
        secondTextSplash = findViewById(R.id.secondsplash);
        secondTextSplash.setVisibility(View.INVISIBLE);
        lottie = findViewById(R.id.lottie);

        firstTextSplash.animate().translationY(-1800).setDuration(2000).setStartDelay(0);
        lottie.animate().translationX(2000).setDuration(2000).setStartDelay(4000);
        secondTextSplash.animate().translationY(-1600).setDuration(1000).setStartDelay(4000)
                .setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(@NonNull Animator animation) {
                        secondTextSplash.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onAnimationEnd(@NonNull Animator animation) {

                    }


                    @Override
                    public void onAnimationCancel(@NonNull Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(@NonNull Animator animation) {

                    }

                });


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        },6000);
    }
}