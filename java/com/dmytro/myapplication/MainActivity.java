package com.dmytro.myapplication;

import static java.lang.Float.parseFloat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.dmytro.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'myapplication' library on application startup.
    static {
        System.loadLibrary("myapplication");
    }

    private ActivityMainBinding binding;

    TextView WelcomeText, QuestionText, bestAptPrice;
    Button FindApartmentsbBtn, GoToMapBtn, GoToWebsiteBtn, CancelBtn, SubmitBtn, okbutton;
    EditText userInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        WelcomeText = findViewById(R.id.textView_Welcome);
        FindApartmentsbBtn = findViewById(R.id.button_FindApartments);
        GoToMapBtn = findViewById(R.id.button_Map);
        GoToWebsiteBtn = findViewById(R.id.button_Website);
        QuestionText = findViewById(R.id.textView_question);
        CancelBtn = findViewById(R.id.button_cancel);
        SubmitBtn = findViewById(R.id.button_submit);
        userInput = findViewById(R.id.textInput_Income);
        bestAptPrice = findViewById(R.id.textView_bestAptPrice);
        okbutton = findViewById(R.id.button_ok);
    }

    public void SendToWebsite(View v){
        Intent gotosite = new Intent(this, WebsiteScreen.class);
        startActivity(gotosite);
    }

    public void SendToMap(View v){
        Intent gotomap = new Intent(this, MapScreen.class);
        startActivity(gotomap);
    }

    public void CancelFindAppartments(View v){
        FindApartmentsbBtn.setVisibility(View.VISIBLE);
        GoToMapBtn.setVisibility(View.VISIBLE);
        GoToWebsiteBtn.setVisibility(View.VISIBLE);
        CancelBtn.setVisibility(View.INVISIBLE);
        SubmitBtn.setVisibility(View.INVISIBLE);
        QuestionText.setVisibility(View.INVISIBLE);
        userInput.setVisibility(View.INVISIBLE);
        bestAptPrice.setVisibility(View.INVISIBLE);
        okbutton.setVisibility(View.INVISIBLE);
    }

    public void SendToGallery(View v){
        FindApartmentsbBtn.setVisibility(View.INVISIBLE);
        GoToMapBtn.setVisibility(View.INVISIBLE);
        GoToWebsiteBtn.setVisibility(View.INVISIBLE);
        CancelBtn.setVisibility(View.VISIBLE);
        SubmitBtn.setVisibility(View.VISIBLE);
        QuestionText.setVisibility(View.VISIBLE);
        userInput.setVisibility(View.VISIBLE);
    }

    public void GoForward(View v){
        bestAptPrice.setVisibility(View.VISIBLE);
        okbutton.setVisibility(View.VISIBLE);
        float income = parseFloat(userInput.getText().toString());
        bestAptPrice.setText(personsincome(income));
    }

    public void okbtn(View v){
        Intent togallery = new Intent(this, GalleryScreen.class);
        startActivity(togallery);
    }

    /**
     * A native method that is implemented by the 'myapplication' native library,
     * which is packaged with this application.
     */
    public native String personsincome(float income);
}