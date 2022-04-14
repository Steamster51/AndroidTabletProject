package com.dmytro.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Contact extends AppCompatActivity {

    EditText name, email, phone, msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        name = findViewById(R.id.editTextTextPersonName);
        email = findViewById(R.id.editTextText_Email);
        phone = findViewById(R.id.editTextText_Phone);
        msg = findViewById(R.id.editTextText_Phone);
    }

    public void sendemail(View v){
        String fullname = name.getText().toString();
        String emailaddress = email.getText().toString();
        String phonenumber = phone.getText().toString();
        String msgtext = msg.getText().toString();
        Intent mail = new Intent(Intent.ACTION_SEND);
        mail.setData(Uri.parse("mailto:d.rudenko51@gmail.com"));
        mail.setType("text/plain");
        try{
            startActivity(Intent.createChooser(mail, "Email sent"));
            finish();
        } catch (android.content.ActivityNotFoundException ex){
            Toast.makeText(this, "Something went wrong", Toast.LENGTH_LONG).show();
        }
    }

    public void backtodetails(View v){
        Intent todetails = new Intent(this, DetailScreen.class);
        startActivity(todetails);
    }
}