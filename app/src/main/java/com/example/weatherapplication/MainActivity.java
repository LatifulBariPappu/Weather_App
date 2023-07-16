package com.example.weatherapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText cityName,countryCode;
    Button getButton;
    TextView resultTv;
    private final String url="http://api.openweathermap.org/data/2.5/weather";
    private final String appid="0190db55681131920b2afda3ea6b2899";
    DecimalFormat df=new DecimalFormat("#.##");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cityName=findViewById(R.id.search_city_edit_text);
        countryCode=findViewById(R.id.search_citycode_edit_text);
        getButton=findViewById(R.id.getBtn);
        resultTv=findViewById(R.id.resultTv);
        getButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
            }
        });
    }

    private void getWeatherDetails(View view) {
        String tempUrl="";
        String city=cityName.getText().toString().trim();
        String country=countryCode.getText().toString().trim();
        if(city.equals("")){
            resultTv.setText("City field can not be empty");
        }else{
            if(!country.equals("")){
                tempUrl=url+"?q="+city+","+country+"&appid"+appid;
            }else{
                tempUrl=url+"?q="+city+"&appid"+appid;
            }
        }
    }
}