package com.askjeffreyliu.vademo;

import android.graphics.drawable.Animatable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView[] imageViews = new ImageView[12];
        imageViews[0] = findViewById(R.id.image1);
        imageViews[1] = findViewById(R.id.image2);
        imageViews[2] = findViewById(R.id.image3);
        imageViews[3] = findViewById(R.id.image4);
        imageViews[4] = findViewById(R.id.image5);
        imageViews[5] = findViewById(R.id.image6);
        imageViews[6] = findViewById(R.id.image7);
        imageViews[7] = findViewById(R.id.image8);
        imageViews[8] = findViewById(R.id.image9);
        imageViews[9] = findViewById(R.id.image10);
        imageViews[10] = findViewById(R.id.image11);
        imageViews[11] = findViewById(R.id.image12);
        for (int i = 0; i < imageViews.length; i++) {
            imageViews[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Animatable animatable = (Animatable) ((ImageView) view).getDrawable();
                    animatable.start();
                }
            });
        }
    }
}
