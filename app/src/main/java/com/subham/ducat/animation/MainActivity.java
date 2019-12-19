package com.subham.ducat.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView imageView;
ImageView imageView2;
ImageView imageView3;
ImageView imageView4;
ImageView imageView5;
ImageView imageView6;
ImageView imageView7;

    Animation animation;
    Animation animation2;
    Animation animation3;
    Animation animation4;
    Animation animation5;
    Animation animation6;
    Animation animation7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    imageView= (ImageView) findViewById(R.id.imageView);
    imageView2= (ImageView) findViewById(R.id.imageView2);
    imageView3= (ImageView) findViewById(R.id.imageView3);
    imageView4= (ImageView) findViewById(R.id.imageView4);
    imageView5= (ImageView) findViewById(R.id.imageView5);
    imageView6= (ImageView) findViewById(R.id.imageView6);
    imageView7= (ImageView) findViewById(R.id.imageView7);




       animation=AnimationUtils.loadAnimation(this,R.anim.first);

       imageView.startAnimation(animation);



        animation2=AnimationUtils.loadAnimation(this,R.anim.second);

        imageView2.startAnimation(animation2);


        animation3=AnimationUtils.loadAnimation(this,R.anim.third);

        imageView3.startAnimation(animation3);


        animation4=AnimationUtils.loadAnimation(this,R.anim.fourth);

        imageView4.startAnimation(animation4);


        animation5=AnimationUtils.loadAnimation(this,R.anim.fifth);

        imageView5.startAnimation(animation5);


        animation6=AnimationUtils.loadAnimation(this,R.anim.sixth);

        imageView6.startAnimation(animation6);


        animation7=AnimationUtils.loadAnimation(this,R.anim.seventh);

        imageView7.startAnimation(animation7);






    }
}
