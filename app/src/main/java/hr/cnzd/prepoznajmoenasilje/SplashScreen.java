package hr.cnzd.prepoznajmoenasilje;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    private ImageView logo, logo2;
    private static int splashTimeOut = 5500;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        logo = findViewById(R.id.logo);
        logo2 = findViewById(R.id.logo2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this, SadrzajOdabir.class);
                startActivity(i);
                finish();
            }
        }, splashTimeOut);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.splash_animation);
        logo.startAnimation(animation);
        logo2.startAnimation(animation);
    }
}