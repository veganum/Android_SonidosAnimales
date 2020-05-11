package com.example.dispositivosmultimedia1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Granja extends AppCompatActivity {

    private MediaPlayer burro, caballo, cerdo, gallina, perro, vaca;
    private ImageView Imburro, Imcaballo, Imcerdo, Imgallina, Imperro, Imvaca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_granja);

        Imburro = findViewById(R.id.burro);
        Imcaballo = findViewById(R.id.caballo);
        Imcerdo = findViewById(R.id.cerdo);
        Imgallina = findViewById(R.id.gallina);
        Imperro = findViewById(R.id.perro);
        Imvaca = findViewById(R.id.vaca);

        burro = MediaPlayer.create(this, R.raw.burro);
        caballo = MediaPlayer.create(this, R.raw.caballo);
        cerdo = MediaPlayer.create(this, R.raw.cerdo);
        gallina = MediaPlayer.create(this, R.raw.gallina);
        perro = MediaPlayer.create(this, R.raw.perro);
        vaca = MediaPlayer.create(this, R.raw.vaca);

        Imburro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!burro.isPlaying()) {
                    burro.start();
                } else {
                    burro.pause();
                }
            }
        });


        Imcaballo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!caballo.isPlaying()) {
                    caballo.start();
                } else {
                    caballo.pause();
                }
            }
        });

        Imcerdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!cerdo.isPlaying()) {
                    cerdo.start();
                } else {
                    cerdo.pause();
                }
            }
        });

        Imgallina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!gallina.isPlaying()) {
                    gallina.start();
                } else {
                    gallina.pause();
                }
            }
        });


        Imperro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!perro.isPlaying()) {
                    perro.start();
                } else {
                    perro.pause();
                }
            }
        });

        Imvaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!vaca.isPlaying()) {
                    vaca.start();
                } else {
                    vaca.pause();
                }
            }
        });

    }
}
