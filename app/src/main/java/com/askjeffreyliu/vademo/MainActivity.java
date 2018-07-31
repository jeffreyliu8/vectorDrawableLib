package com.askjeffreyliu.vademo;

import android.graphics.drawable.Animatable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;
    private ImageView imageView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.image1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animatable animatable = (Animatable) imageView1.getDrawable();
                animatable.start();
            }
        });

        imageView2 = findViewById(R.id.image2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animatable animatable = (Animatable) imageView2.getDrawable();
                animatable.start();
            }
        });

        imageView3 = findViewById(R.id.image3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animatable animatable = (Animatable) imageView3.getDrawable();
                animatable.start();
            }
        });

        imageView4 = findViewById(R.id.image4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animatable animatable = (Animatable) imageView4.getDrawable();
                animatable.start();
            }
        });

        imageView5 = findViewById(R.id.image5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animatable animatable = (Animatable) imageView5.getDrawable();
                animatable.start();
            }
        });
    }
}
