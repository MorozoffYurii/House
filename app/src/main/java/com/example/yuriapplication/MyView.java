package com.example.yuriapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //super.onDraw(canvas);
        Paint pensil = new Paint();
        pensil.setStyle(Paint.Style.STROKE);
        pensil.setStrokeWidth(35);
        pensil.setColor(Color.BLACK);     //цвет маркера
        canvas.drawColor(Color.GREEN); //цвет холста

        pensil.setColor(Color.BLUE);
        Path path2 = new Path();
        path2.moveTo(0, 0);
        path2.lineTo(5000, 0);
        path2.lineTo(5000, 1000);
        path2.lineTo(0, 1000);
        pensil.setStyle((Paint.Style.FILL));
        canvas.drawPath(path2, pensil);

        pensil.setColor(Color.BLACK);
        canvas.drawRect(500, 700, 1200, 1200, pensil);
        canvas.drawRect(700, 800, 1000, 1000, pensil);
        canvas.drawRect(1000, 300, 1100, 900, pensil);

        pensil.setStyle((Paint.Style.FILL));

        pensil.setColor(Color.YELLOW);
        canvas.drawRect(600, 800, 1000, 1000, pensil);

        pensil.setStyle((Paint.Style.STROKE));
        pensil.setColor(Color.BLACK);
        canvas.drawRect(550, 700, 800, 1050, pensil);
        canvas.drawRect(550, 900, 1000, 900, pensil);

        pensil.setColor(Color.BLACK);
        Path path = new Path();
        path.moveTo(500, 700);
        path.lineTo(850, 400);
        path.lineTo(1200, 700);
        pensil.setStyle((Paint.Style.FILL));
        canvas.drawPath(path, pensil);



        pensil.setColor(Color.WHITE);
        canvas.drawCircle(2000, 400, 200, pensil);


    }
}
