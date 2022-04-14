package com.dmytro.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailScreen extends AppCompatActivity {

    TextView addresstext, description;
    ImageView mainimage, image2, image3, image4, image5, image6, image7, image8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_screen);

        mainimage = findViewById(R.id.imageView2);
        addresstext = findViewById(R.id.textView_Address);
        description = findViewById(R.id.textView2);
        image2 = findViewById(R.id.imageView3);
        image3 = findViewById(R.id.imageView4);
        image4 = findViewById(R.id.imageView5);
        image5 = findViewById(R.id.imageView6);
        image6 = findViewById(R.id.imageView7);
        image7 = findViewById(R.id.imageView8);
        image8 = findViewById(R.id.imageView9);
        Intent intent = getIntent();
        String headeraddress = intent.getStringExtra(GalleryScreen.address);
        String descriptiontext = intent.getStringExtra(GalleryScreen.description);
        int bigImage = intent.getIntExtra(GalleryScreen.seenpic, 1);
        int bigImage2 = intent.getIntExtra(GalleryScreen.seenpic2, 1);
        int bigImage3 = intent.getIntExtra(GalleryScreen.seenpic3, 1);
        int bigImage4 = intent.getIntExtra(GalleryScreen.seenpic4, 1);
        int bigImage5 = intent.getIntExtra(GalleryScreen.seenpic5, 1);
        int bigImage6 = intent.getIntExtra(GalleryScreen.seenpic6, 1);
        int bigImage7 = intent.getIntExtra(GalleryScreen.seenpic7, 1);
        int bigImage8 = intent.getIntExtra(GalleryScreen.seenpic8, 1);
        //addresstext.setText(headeraddress);
        description.setText(descriptiontext);
        mainimage.setImageResource(bigImage);
        image2.setImageResource(bigImage2);
        image3.setImageResource(bigImage3);
        image4.setImageResource(bigImage4);
        image5.setImageResource(bigImage5);
        image6.setImageResource(bigImage6);
        if (image7 != null) {
            image7.setImageResource(bigImage7);
        }
        else{
            image7.setVisibility(View.INVISIBLE);
        }
        if(image8 != null){
            image8.setImageResource(bigImage8);
        }
        else{
            image8.setVisibility(View.INVISIBLE);
        }
    }

    public void pic3(View v){
        mainimage.setImageResource(R.drawable.ap1p3);
    }

    public void pic4(View v){
        mainimage.setImageResource(R.drawable.ap1p4);
    }

    public void pic5(View v){
        mainimage.setImageResource(R.drawable.ap1p5);
    }

    public void pic6(View v){
        mainimage.setImageResource(R.drawable.ap1p6);
    }

    public void pic7(View v){
        mainimage.setImageResource(R.drawable.ap1p7);
    }

    public void pic8(View v){
        mainimage.setImageResource(R.drawable.ap1p8);
    }

    public void pic1(View v){
        mainimage.setImageResource(R.drawable.ap1p1);
    }

    public void backToGallery(View v){
        Intent backtogallery = new Intent(this, GalleryScreen.class);
        startActivity(backtogallery);
    }

    public void email(View v){
        Intent gotocontact = new Intent(this, Contact.class);
        startActivity(gotocontact);
    }
}