package com.abhishek.game1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import static com.abhishek.game1.GameView.screenRatioX;
import static com.abhishek.game1.GameView.screenRatioY;

public class Bullet {
    int x,y;
    Bitmap bullet;
    Bullet(Resources res){
        bullet= BitmapFactory.decodeResource(res,R.drawable.bullet);
        int width=bullet.getWidth();
        int height=bullet.getHeight();
        width/=4;
        height/=4;
        width*=(int)screenRatioX;
        height*=(int)screenRatioY;
        bullet=Bitmap.createScaledBitmap(bullet,width,height,false);

    }
}
