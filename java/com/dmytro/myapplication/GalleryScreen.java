package com.dmytro.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class GalleryScreen extends AppCompatActivity {

    TextView addresscell, descriptioncell, addresscell2, descriptioncell2, addresscell3, descriptioncell3, addresscell4, descriptioncell4, addresscell5, descriptioncell5, addresscell6, descriptioncell6, addresscell7, descriptioncell7, addresscell8, descriptioncell8, addresscell9, descriptioncell9, addresscell10, descriptioncell10;
    ImageView mainImagecell2, mainImagecell, mainImagecell3, mainImagecell4, mainImagecell5, mainImagecell6, mainImagecell7, mainImagecell8, mainImagecell9, mainImagecell10;

    public static final String address = "AddressHeader";
    public static final String description = "AddressHeader";
    public static final String seenpic = "pic1";
    public static final String seenpic2 = "pic2";
    public static final String seenpic3 = "pic3";
    public static final String seenpic4 = "pic4";
    public static final String seenpic5 = "pic5";
    public static final String seenpic6 = "pic6";
    public static final String seenpic7 = "pic7";
    public static final String seenpic8 = "pic8";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_screen);
        addresscell = findViewById(R.id.textView_cellOneHeader);
        descriptioncell = findViewById(R.id.textView_cellOneDescription);
        mainImagecell = findViewById(R.id.imageView_cellOne);
        addresscell2 = findViewById(R.id.textView_cellTwoHeader);
        descriptioncell2 = findViewById(R.id.textView_cellTwoDescription);
        mainImagecell2 = findViewById(R.id.imageView_cellTwo);
        addresscell3 = findViewById(R.id.textView_cellThreeHeader);
        descriptioncell3 = findViewById(R.id.textView_cellThreeDescription);
        mainImagecell3 = findViewById(R.id.imageView_cellThree);
        addresscell4 = findViewById(R.id.textView_cellFourHeader);
        descriptioncell4 = findViewById(R.id.textView_cellFourDescription);
        mainImagecell4 = findViewById(R.id.imageView_cellFour);
        addresscell5 = findViewById(R.id.textView_cellFiveHeader);
        descriptioncell5 = findViewById(R.id.textView_cellFiveDescription);
        mainImagecell5 = findViewById(R.id.imageView_cellFive);
        addresscell6 = findViewById(R.id.textView_cellSixHeader);
        descriptioncell6 = findViewById(R.id.textView_cellSixDescription);
        mainImagecell6 = findViewById(R.id.imageView_cellSix);
        addresscell7 = findViewById(R.id.textView_cellSevenHeader);
        descriptioncell7 = findViewById(R.id.textView_cellSevenDescription);
        mainImagecell7 = findViewById(R.id.imageView_cellSeven);
        addresscell8 = findViewById(R.id.textView_cellEightHeader);
        descriptioncell8 = findViewById(R.id.textView_cellEightDescription);
        mainImagecell8 = findViewById(R.id.imageView_cellEight);
        addresscell9 = findViewById(R.id.textView_cellNineHeader);
        descriptioncell9 = findViewById(R.id.textViewcellNineDescription);
        mainImagecell9 = findViewById(R.id.imageView_cellNine);
        addresscell10 = findViewById(R.id.textView_cellTenHeader);
        descriptioncell10 = findViewById(R.id.textView_cellTenDescription);
        mainImagecell10 = findViewById(R.id.imageView_cellTen);
    }

    public void seeDetails1(View v){
        String headeraddress = addresscell.getText().toString();
        String descriptiontext =descriptioncell.getText().toString();
        Intent goToDetails1 = new Intent(this, DetailScreen.class);
        goToDetails1.putExtra(address, headeraddress);
        goToDetails1.putExtra(description, descriptiontext);
        goToDetails1.putExtra(seenpic, R.drawable.ap1p1);
        goToDetails1.putExtra(seenpic2, R.drawable.ap1p2);
        goToDetails1.putExtra(seenpic3, R.drawable.ap1p3);
        goToDetails1.putExtra(seenpic4, R.drawable.ap1p4);
        goToDetails1.putExtra(seenpic5, R.drawable.ap1p5);
        goToDetails1.putExtra(seenpic6, R.drawable.ap1p6);
        goToDetails1.putExtra(seenpic7, R.drawable.ap1p7);
        goToDetails1.putExtra(seenpic8, R.drawable.ap1p8);
        startActivity(goToDetails1);
    }

    public void seeDetails2(View v){
        String headeraddress = addresscell2.getText().toString();
        String descriptiontext = descriptioncell2.getText().toString();
        Intent goToDetails2 = new Intent(this, DetailScreen.class);
        goToDetails2.putExtra(address, headeraddress);
        goToDetails2.putExtra(description, descriptiontext);
        goToDetails2.putExtra(seenpic, R.drawable.ap2p1);
        goToDetails2.putExtra(seenpic2, R.drawable.ap2p2);
        goToDetails2.putExtra(seenpic3, R.drawable.ap2p3);
        goToDetails2.putExtra(seenpic4, R.drawable.ap2p4);
        goToDetails2.putExtra(seenpic5, R.drawable.ap2p5);
        goToDetails2.putExtra(seenpic6, R.drawable.ap2p6);
        goToDetails2.putExtra(seenpic7, R.drawable.ap2p7);
        goToDetails2.putExtra(seenpic8, R.drawable.ap2p8);
        startActivity(goToDetails2);
    }

    public void seeDetails3(View v){
        String headeraddress = addresscell3.getText().toString();
        String descriptiontext = descriptioncell3.getText().toString();
        Intent goToDetails3 = new Intent(this, DetailScreen.class);
        goToDetails3.putExtra(address, headeraddress);
        goToDetails3.putExtra(description, descriptiontext);
        goToDetails3.putExtra(seenpic, R.drawable.ap3p1);
        goToDetails3.putExtra(seenpic2, R.drawable.ap3p2);
        goToDetails3.putExtra(seenpic3, R.drawable.ap3p3);
        goToDetails3.putExtra(seenpic4, R.drawable.ap3p4);
        goToDetails3.putExtra(seenpic5, R.drawable.ap3p5);
        goToDetails3.putExtra(seenpic6, R.drawable.ap3p6);
        goToDetails3.putExtra(seenpic7, R.drawable.ap3p7);
        startActivity(goToDetails3);
    }

    public void seeDetails4(View v){
        String headeraddress = addresscell4.getText().toString();
        String descriptiontext = descriptioncell4.getText().toString();
        Intent goToDetails4 = new Intent(this, DetailScreen.class);
        goToDetails4.putExtra(address, headeraddress);
        goToDetails4.putExtra(description, descriptiontext);
        goToDetails4.putExtra(seenpic, R.drawable.ap4p1);
        goToDetails4.putExtra(seenpic2, R.drawable.ap4p2);
        goToDetails4.putExtra(seenpic3, R.drawable.ap4p3);
        goToDetails4.putExtra(seenpic4, R.drawable.ap4p4);
        goToDetails4.putExtra(seenpic5, R.drawable.ap4p5);
        goToDetails4.putExtra(seenpic6, R.drawable.ap4p6);
        goToDetails4.putExtra(seenpic7, R.drawable.ap4p7);
        startActivity(goToDetails4);
    }

    public void seeDetails5(View v){
        String headeraddress = addresscell5.getText().toString();
        String descriptiontext = descriptioncell5.getText().toString();
        Intent goToDetails5 = new Intent(this, DetailScreen.class);
        goToDetails5.putExtra(address, headeraddress);
        goToDetails5.putExtra(description, descriptiontext);
        goToDetails5.putExtra(seenpic, R.drawable.ap5p1);
        goToDetails5.putExtra(seenpic2, R.drawable.ap5p2);
        goToDetails5.putExtra(seenpic3, R.drawable.ap5p3);
        goToDetails5.putExtra(seenpic4, R.drawable.ap5p4);
        goToDetails5.putExtra(seenpic5, R.drawable.ap5p5);
        goToDetails5.putExtra(seenpic6, R.drawable.ap5p6);
        goToDetails5.putExtra(seenpic7, R.drawable.ap5p7);
        goToDetails5.putExtra(seenpic8, R.drawable.ap5p8);
        startActivity(goToDetails5);
    }

    public void seeDetails6(View v){
        String headeraddress = addresscell6.getText().toString();
        String descriptiontext = descriptioncell6.getText().toString();
        Intent goToDetails6 = new Intent(this, DetailScreen.class);
        goToDetails6.putExtra(address, headeraddress);
        goToDetails6.putExtra(description, descriptiontext);
        goToDetails6.putExtra(seenpic, R.drawable.ap6p1);
        goToDetails6.putExtra(seenpic2, R.drawable.ap6p2);
        goToDetails6.putExtra(seenpic3, R.drawable.ap6p3);
        goToDetails6.putExtra(seenpic4, R.drawable.ap6p4);
        goToDetails6.putExtra(seenpic5, R.drawable.ap6p5);
        goToDetails6.putExtra(seenpic6, R.drawable.ap6p6);
        goToDetails6.putExtra(seenpic7, R.drawable.ap6p7);
        goToDetails6.putExtra(seenpic8, R.drawable.ap6p8);
        startActivity(goToDetails6);
    }

    public void seeDetails7(View v){
        String headeraddress = addresscell7.getText().toString();
        String descriptiontext = descriptioncell7.getText().toString();
        Intent goToDetails7 = new Intent(this, DetailScreen.class);
        goToDetails7.putExtra(address, headeraddress);
        goToDetails7.putExtra(description, descriptiontext);
        goToDetails7.putExtra(seenpic, R.drawable.ap7p1);
        goToDetails7.putExtra(seenpic2, R.drawable.ap7p2);
        goToDetails7.putExtra(seenpic3, R.drawable.ap7p3);
        goToDetails7.putExtra(seenpic4, R.drawable.ap7p4);
        goToDetails7.putExtra(seenpic5, R.drawable.ap7p5);
        goToDetails7.putExtra(seenpic6, R.drawable.ap7p6);
        goToDetails7.putExtra(seenpic7, R.drawable.ap7p7);
        goToDetails7.putExtra(seenpic8, R.drawable.ap7p8);
        startActivity(goToDetails7);
    }

    public void seeDetails8(View v){
        String headeraddress = addresscell8.getText().toString();
        String descriptiontext = descriptioncell8.getText().toString();
        Intent goToDetails8 = new Intent(this, DetailScreen.class);
        goToDetails8.putExtra(address, headeraddress);
        goToDetails8.putExtra(description, descriptiontext);
        goToDetails8.putExtra(seenpic, R.drawable.ap8p1);
        goToDetails8.putExtra(seenpic2, R.drawable.ap8p2);
        goToDetails8.putExtra(seenpic3, R.drawable.ap8p3);
        goToDetails8.putExtra(seenpic4, R.drawable.ap8p4);
        goToDetails8.putExtra(seenpic5, R.drawable.ap8p5);
        goToDetails8.putExtra(seenpic6, R.drawable.ap8p6);
        goToDetails8.putExtra(seenpic7, R.drawable.ap8p7);
        goToDetails8.putExtra(seenpic8, R.drawable.ap8p8);
        startActivity(goToDetails8);
    }

    public void seeDetails9(View v){
        String headeraddress = addresscell9.getText().toString();
        String descriptiontext = descriptioncell9.getText().toString();
        Intent goToDetails9 = new Intent(this, DetailScreen.class);
        goToDetails9.putExtra(address, headeraddress);
        goToDetails9.putExtra(description, descriptiontext);
        goToDetails9.putExtra(seenpic, R.drawable.ap9p1);
        goToDetails9.putExtra(seenpic2, R.drawable.ap9p2);
        goToDetails9.putExtra(seenpic3, R.drawable.ap9p3);
        goToDetails9.putExtra(seenpic4, R.drawable.ap9p4);
        goToDetails9.putExtra(seenpic5, R.drawable.ap9p5);
        goToDetails9.putExtra(seenpic6, R.drawable.ap9p6);
        startActivity(goToDetails9);
    }

    public void seeDetails10(View v){
        String headeraddress = addresscell10.getText().toString();
        String descriptiontext = descriptioncell10.getText().toString();
        Intent goToDetails10 = new Intent(this, DetailScreen.class);
        goToDetails10.putExtra(address, headeraddress);
        goToDetails10.putExtra(description, descriptiontext);
        goToDetails10.putExtra(seenpic, R.drawable.ap10p1);
        goToDetails10.putExtra(seenpic2, R.drawable.ap10p2);
        goToDetails10.putExtra(seenpic3, R.drawable.ap10p3);
        goToDetails10.putExtra(seenpic4, R.drawable.ap10p4);
        goToDetails10.putExtra(seenpic5, R.drawable.ap10p5);
        goToDetails10.putExtra(seenpic6, R.drawable.ap10p6);
        goToDetails10.putExtra(seenpic7, R.drawable.ap10p6);
        goToDetails10.putExtra(seenpic8, R.drawable.ap10p8);
        startActivity(goToDetails10);
    }
}