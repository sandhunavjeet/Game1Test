package com.example.navsa.game1test;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView ivFrame = (ImageView) findViewById(R.id.imageView);
        Bitmap b = Bitmap.createBitmap(300, 500, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(b);
        Paint paintbrush = new Paint();
        canvas.drawColor(Color.RED);
        paintbrush.setColor(Color.argb(255,255,255,255));

        canvas.drawLine(10,50,200,50,paintbrush);
        canvas.drawRect(110,110,120,120,paintbrush);
        canvas.drawCircle(200,200,10,paintbrush);


        paintbrush.setTextSize(50);
        canvas.drawText("Hello, this is a Game!" , 0,400,paintbrush);
        ivFrame.setImageBitmap(b);

    }
}
