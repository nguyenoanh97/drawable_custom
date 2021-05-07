package com.example.drawable;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ClipDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgMonAn;
    Button btnClip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgMonAn = (ImageView) findViewById(R.id.imageViewMonAn);
        btnClip = (Button) findViewById(R.id.button_clip) ;

        imgMonAn.setImageLevel(5000);

        ClipDrawable clipdrawable = (ClipDrawable) imgMonAn.getDrawable();

        btnClip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clipdrawable.getLevel()>=10000) {

                }
                imgMonAn.setImageLevel(clipdrawable.getLevel() + 1000);

            }
        });
    }
}