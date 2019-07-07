package com.example.enfergame;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SpashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); // Retira a Action Bar
        setContentView(R.layout.activity_spash_screen);

        // Timer da splash screen
        int SPLASH_TIME_OUT = 3000;

            new Handler().postDelayed(new Runnable() {
                /*
                 * Exibindo splash com um timer.
                 */
                @Override
                public void run() {
                    // Esse método será executado sempre que o timer acabar
                    // E inicia a activity principal
                    Intent i = new Intent(SpashScreen.this,
                            Tutorial.class);
                    startActivity(i);
                    overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);

                    // Fecha esta activity
                    finish();
                }
            }, SPLASH_TIME_OUT);

    }
}
